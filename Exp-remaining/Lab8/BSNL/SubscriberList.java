import java.util.*;
import java.io.*;
class SubscriberList{
	Subscriber ns,pre=null,current=null,post=null,start=null,end=null;
	int count=0;
	public void add(String sid,String sn,int bal){
		ns=new Subscriber(sid,sn,bal);
		if(start==null){
			start=end=ns;
			count++;
		}
		else{
			end.next=ns;
			end=ns;
			count++;
		}
	}
	public void search(String sid){
		current=start;
		int flag=0;
		while(current!=null){
			if(current.subId.equals(sid)){
				flag++;
				break;
			}
			current=current.next;
		}
		if(flag>0){
			System.out.println(sid+" found---->Details: "+current);
		}
		else{
			System.out.println(sid+" Not found");
		}
	}
	public void remove(String sid){
		current=start;
		if(current.subId.equals(sid)){
			start=start.next;
			count--;
		}
		else{
			while(current.next.next!=null){
				if(current.next.subId.equals(sid)){
					current.next=current.next.next;
					count--;
				}
				current=current.next;
			}
			if(current.next.subId.equals(sid)){
				end=current;
				end.next=null;
				count--;
			}
		}
	}
	public void sort(){
		int out=count-1;
		while(out>0){
			pre=null;current=start;post=current.next;
			int in=0;
			while(in<out){
				if(current.subId.compareTo(post.subId)>0){
					current.next=post.next;
					post.next=current;
					if(pre==null) start=post;
					else pre.next=post;
					pre=post;
					post=current.next;
				}
				else{
					pre=current;current=post;post=current.next;
				}
				in++;
			}
			out--;
		}
	}
	public void updateList(String file){
		try{
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			current=start;
			while(current!=null){
				bw.write(current+"\n");
				current=current.next;
			}
			bw.close();fw.close();
		}catch(Exception e){}
	}
}
