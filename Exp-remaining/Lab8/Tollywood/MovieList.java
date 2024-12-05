import java.util.*;
import java.io.*;
class MovieList{
	MovieInfo nm,start=null,end=null;
	int count=0;
	public void add(String mn,String hn,String dn,int rd,double gc){
		nm=new MovieInfo(mn,hn,dn,rd,gc);
		if(start==null){
			start=end=nm;
			end.next=start;
		}
		else{
			end.next=nm;
			end=nm;
		}
		count++;
	}
	public void display(){
		MovieInfo current=start;
		while(current!=null){
			System.out.println(current);
			current=current.next;
		}
	}
	public void search(String mn){
		int flag=0;
		MovieInfo current=start;
		while(current!=null){
			if(current.mName.equals(mn)){
				System.out.println("Found");
				System.out.println(current);
				flag++;
			}
			current=current.next;
		}
		if(flag==0){
			System.out.println("Not found");
		}
	}
	public void remove(String mn){
		MovieInfo current=start;
		if(current.mName.equals(mn)){
			start=start.next;
			count--;
		}
		else{
			while(current.next.next!=null){
				if(current.next.mName.equals(mn)){
					current.next=current.next.next;
					count--;
				}
				current=current.next;
			}
			if(current.mName.equals(mn)){
				end=current;
				end.next=null;
				count--;
			}
		}
	}
	public void sortByGrossCollections(){
		MovieInfo pre=null,current=null,post=null;
		int out=count-1;
		while(out>0){
			pre=null;current=start;post=current.next;
			int in=0;
			while(in<out){
				if(current.grossCollections<post.grossCollections){
					current.next=post.next;
					post.next=current;
					if(pre==null){
						start=post;
						pre=post;
					}
					else{
						pre.next=post;
						pre=post;
					}
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
	public void update(){
		try{
			FileWriter fw=new FileWriter("movies.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			MovieInfo current=start;
			while(current!=null){
				bw.write(current+"\n");
				current=current.next;
			}
			bw.close();fw.close();
		}catch(Exception e){};
	}
}
