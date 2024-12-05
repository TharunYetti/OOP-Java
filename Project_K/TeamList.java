import java.util.*;
import java.io.*;
class TeamList{
	Team start,end,current;
	int count;
	public void add(String n,int w,double d){
		current=new Team(n,w,d);
		if(start==null){start=end=current;count++;}
		else{end.next=current;end=current;count++;}
	}
	public void traversal(){
		current=start;
		while(current!=null){System.out.println(current);current=current.next;}
	}
	public void update(String n){
		current=start;
		int flag=0;
		while(current!=null){
			if(current.name.equals(n)){
				current.wins=current.wins+1;
				break;
			}
			else current=current.next;
		}
	}
	public void updateRunRate(String s,double rr){
		current=start;
		while(current!=null){
			if(current.name.equals(s)){
				current.netRunRate+=rr;
				break;
			}
			current=current.next;
		}
	}
	public String winnerTeam(){
		current=start;
		int maxWins=current.wins;
		String winnerTeam=current.name;
		while(current!=null){
			if(current.wins>maxWins){
				maxWins=current.wins;
			}
			current=current.next;
		}
		current=start;
		double nrr=0;
		while(current!=null){
			if(current.wins==maxWins){
				if(current.netRunRate>nrr){
					nrr=current.netRunRate;
					winnerTeam=current.name;
				}
			}
			current=current.next;
		}
		return winnerTeam;
	}
	public void sort(){
		current=start;
		Team pre=null,post=null;
		int out=count-1;
		while(out>0){
			pre=null;current=start;post=current.next;
			int in=0;
			while(in<out){
				if(current.wins<post.wins || (current.wins==post.wins && current.netRunRate<post.netRunRate)){
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
					pre=current;
					current=post;
					post=post.next;
				}
				in++;
			}
			out--;
		}
	}
	public String giveTop1(){
		sort();
		current=start;
		return current.name;
	}
	public String giveTop2(){
		sort();
		current=start;
		return current.next.name;
	}
	public String giveTop3(){
		sort();
		current=start;
		return current.next.next.name;
	}
	public String giveTop4(){
		sort();
		current=start;
		return current.next.next.next.name;
	}
	public void writeData(){
		try{
			FileWriter fw=new FileWriter("score.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("\n\t\t\t\t\t\t<<<<<<<<<<<<<<<<< IPL BOARD >>>>>>>>>>>>>>>>\n\n");
			current=start;
			while(current!=null){
				bw.write(current+"\n");
				current=current.next;
			}
			bw.write("\n");
			bw.close();
			fw.close();
		}catch(Exception e){}
	}
}
