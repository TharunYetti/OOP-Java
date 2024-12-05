import java.util.*;
import java.io.*;
class PlayerList{
	int count=0;
	Player start=null,end=null,pre=null,current=null,post=null,p;
	public void add(String n,int tr,double avg){
		p=new Player(n,tr,avg);
		if(start==null){
			start=end=p;
			count++;
		}
		else{
			end.next=p;
			end=p;
			count++;
		}
	}
	public void search(String n){//based on name
		current=start;
		int flag=0;
		while(current!=null){
			if(current.name.equals(n)){
				flag++;
				break;
			}
			current=current.next;
		}
		if(flag>0){
			System.out.println(n+" found --->Details: "+current);
		}
		else{
			System.out.println(n+" not Found");
		}
	}
	public void remove(String n){
		current=start;
		if(current.name.equals(n)){
			start=start.next;
			count--;
		}
		else{
			while(current.next.next!=null){
				if(current.next.name.equals(n)){
					current.next=current.next.next;
					count--;
				}
			}
			if(current.next.name.equals(n)){
				end=current;
				end.next=null;
				count--;
			}
		}
		
	}
	public void sort(){//based on average-score
		int out=count-1;
		while(out>0){
			pre=null;current=start;post=current.next;
			int in=0;
			while(in<out){
				if(current.average>post.average){
					current.next=post.next;
					post.next=current;
					if(pre==null){
						start=post;
					}
					else{
						pre.next=post;
					}
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
