import java.io.*;
import java.util.*;
class IPL extends NamePrint{
	static TeamList tl=new TeamList();
	static String teams[]={"CSK","RCB","DC","GT","KKR","MI","LSG","PK","RR","SRH"};
	static int size=10;
	//static String schedule[][]=new ;
	public static void update(String team){
		for(int i=0;i<size;i++){
			if(teams[i].equals(team)){
				tl.update(teams[i]);
			}
		}	
	}
	public static String obtainTeamFile(String n){
		if(teams[0].equals(n)) return "csk.txt";
		else if(teams[1].equals(n)) return "rcb.txt";
		else if(teams[2].equals(n)) return "dc.txt";
		else if(teams[3].equals(n)) return "gt.txt";
		else if(teams[4].equals(n)) return "kkr.txt";
		else if(teams[5].equals(n)) return "mi.txt";
		else if(teams[6].equals(n)) return "lsg.txt";
		else if(teams[7].equals(n)) return "pk.txt";
		else if(teams[8].equals(n)) return "rr.txt";
		else return "srh.txt";
	}
	public static void main(String args[])throws IOException{
		System.out.printf("\n%110s\n","<-<-<-<-<-<-<-<-<-<- WELCOME TO INDIAN PREMIERE LEAGUE ->->->->->->->->->->");
		System.out.println("\n\t\t\t\t\t\t\t\tIntial Teams Board\n");
		for(int i=0;i<size;i++) tl.add(teams[i],0,0.0);
		tl.traversal();
		Match match=new Match();
		String schedule[][]=new String[45][2];
		String team1="",team2="",team1Name="",team2Name="";
		int counter=0;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				schedule[counter][0]=teams[i];
				schedule[counter][1]=teams[j];
				counter++;
			}
		}
		System.out.printf("\n%93s\n\n","(: (: (: IPL MATCH SCHEDULE :) :) :)");
		int f=0,b=44,date=18,month=7;
		String time1="14:00 - 23:00",time2="10:00 - 19:00";
		for(int k=0;k<45;k++){
			if(k%2==0){
				team1Name=schedule[f][0];team2Name=schedule[f][1];
				System.out.printf("%50d",(k+1));
				System.out.print(".\t"+team1Name+" Vs "+team2Name);
				System.out.printf("\t%d-%d-2023\t%s\n",date,month,time1);
				date+=2;
				if(date>31){date=1;month++;}
				f=f+2;
			}
			else{
				team1Name=schedule[b][0];team2Name=schedule[b][1];
				System.out.printf("%50d",(k+1));
				System.out.print(".\t"+team1Name+" Vs "+team2Name);
				System.out.printf("\t%d-%d-2023\t%s\n",date,month,time2);
				date+=2;
				if(date>31){date=1;month++;}
				if(k==1) b--;
				else b=b-2;
			}
		}
		int front=0,back=44;
		for(int i=0;i<45;i++){
			if(i%2==0){
				team1=obtainTeamFile(schedule[front][0]);team2=obtainTeamFile(schedule[front][1]);
				team1Name=schedule[front][0];team2Name=schedule[front][1];
				System.out.println("\n"+(i+1)+".MATCH STARTED BETWEEN "+team1Name+" AND "+team2Name+"\n");
				front=front+1;
			}
			else{
				team1=obtainTeamFile(schedule[back][0]);team2=obtainTeamFile(schedule[back][1]);
				team1Name=schedule[back][0];team2Name=schedule[back][1];
				System.out.println("\n"+(i+1)+".MATCH STARTED BETWEEN "+team1Name+" AND "+team2Name+"\n");
				back=back-1;
			}
			String winner=match.playMatch(team1,team2);
			if(winner.equals(team1)){
				System.out.println("\n--> Result: "+team1Name+" IS THE WINNER\n");
				tl.update(team1Name);
			}
			else{
				System.out.println("\n--> Result: "+team2Name+" IS THE WINNER\n");
				tl.update(team2Name);
			}
		}
		System.out.println("\n\tAfter Completing All The Matches The Winning Board Is As Follows\n");
		tl.sort();
		tl.traversal();
		String top1=tl.giveTop1(),top2=tl.giveTop2(),top3=tl.giveTop3(),top4=tl.giveTop4(),finalist1="",finalist2="";
		System.out.printf("\n\n%100s\n\n","------------ SEMI FINALS BETWEEN TOP 4 TEAMS -------------");
		System.out.println("\t\t\t\t\t\t\t\t1."+top1+" Vs "+top3+"\n\t\t\t\t\t\t\t\t2."+top3+" Vs "+top4);
		System.out.println("\n1.MATCH STARTED BETWEEN "+top1+" AND "+top3+"\n");
		String finals_one=match.playMatch(obtainTeamFile(top1),obtainTeamFile(top3));
		if(finals_one.equals(obtainTeamFile(top1))){tl.update(top1);finalist1=top1;}
		else{tl.update(top3);finalist1=top3;}
		System.out.println("\n--> Result: "+finalist1+" IS THE WINNER\n");
		System.out.println("\n2.MATCH STARTED BETWEEN "+top2+" AND "+top4+"\n");
		String finals_two=match.playMatch(obtainTeamFile(top2),obtainTeamFile(top4));
		if(finals_two.equals(obtainTeamFile(top2))){tl.update(top2);finalist2=top2;}
		else{tl.update(top4);finalist2=top4;}
		System.out.println("\n--> Result: "+finalist2+" IS THE WINNER\n");
		System.out.println("\t\t\t\t\t\t---------------------- FINAL MATCH --------------------\n\n\t\t\t\t\t\t\t\t\t"+finalist1+" Vs "+finalist2);
		System.out.println("\n<<< FINAL MATCH BETWEEN "+finalist1+" AND "+finalist2+"\n");
		String winner_file=match.playMatch(obtainTeamFile(finalist1),obtainTeamFile(finalist2)),winner="";
		if(winner_file.equals(obtainTeamFile(finalist1))){tl.update(finalist1);winner=finalist1;}
		else{tl.update(finalist2);winner=finalist2;}
		System.out.println("\n--> Result: "+winner+" IS THE WINNER\n");
		System.out.println("\nAfter all the Matches and Finals The Winning Board is As Follows");
		//tl.sort();
		tl.traversal();
		//System.out.println("\nAnd the Winner is The Team "+tl.giveTop1()+" ,Congratualtions!!!\n");
		System.out.println("\nAnd the Winner is The Team "+winner+" ,Congratualtions!!!\n");
		tl.writeData();
		//printName("IPL WINNER 2023 IS "+tl.giveTop1());
		printName("IPL WINNER 2023 IS "+winner);
	}
}
