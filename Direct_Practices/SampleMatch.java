import java.util.*;
import java.io.*;
class SampleMatch{
	static int balls,totalOvers=10,over,score;
	static Random r=new Random();
	static int giveScore(StringTokenizer st){
		balls=1;over=1;score=0;
		String striker=st.nextToken();
		String nonStriker=st.nextToken(),temp2=striker+" and "+nonStriker+" came into field";
		System.out.printf("%-50s",temp2);
		System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
		int run=r.nextInt(1,10);
		while(st.hasMoreTokens() && over<=totalOvers){
			String temp="";
			switch(run){
				case 1:{temp2=striker+" gave one run!";
					System.out.printf("%-50s",temp2);
					score+=1;temp=striker;striker=nonStriker;nonStriker=temp;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 2:{temp2=striker+" and "+nonStriker+" gave TwoDee!";
					System.out.printf("%-50s",temp2);
					score+=2;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 3:{temp2=striker+" and "+nonStriker+" gave three runs!";
					System.out.printf("%-50s",temp2);
					score+=3;temp=striker;striker=nonStriker;nonStriker=temp;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 4:{temp2="Yahooo!! "+striker+" hit a four";
					System.out.printf("%-50s",temp2);
					score+=4;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 5:{temp2=striker+" and "+nonStriker+" gave Five runs!";
					System.out.printf("%-50s",temp2);
					score+=5;temp=striker;striker=nonStriker;nonStriker=temp;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 6:{temp2="Fantastic "+striker+"!! its a Boundary..SIXER!";
					System.out.printf("%-50s",temp2);
					score+=6;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 7:{temp2="Ohh It's a No ball";
					System.out.printf("%-50s",temp2);
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 8:{temp2="It's a Wide";
					System.out.printf("%-50s",temp2);
					if(!st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					score+=1;
					}break;
				case 9:{temp2=striker+" Out";
					System.out.printf("%-50s",temp2);
					striker=st.nextToken();
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(st.hasMoreTokens()||over<=10)
						System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
					System.out.println(striker+" came into ground");
					}break;
			}
			run=r.nextInt(1,10);
		}
		if(!st.hasMoreTokens()) System.out.println("\n>>>>>> ALL OUT");
		else if(over>10) System.out.println("\n>>>>>> OVERS COMPLETED");
		return score;
	}
	public static void main(String args[])throws IOException{
		System.out.println("\n\t\t\t\t\t\t<<<<<<\tSAMPLE MATCH FOR THE TEAMS CSK AND RCB\t>>>>>>\t\t\t\t\t\t\n");
		FileReader fr=null;
		BufferedReader br=null;
		fr=new FileReader("csk.txt");
		br=new BufferedReader(fr);
		String line="";
		int cskScore=0,rcbScore=0;
		while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line);
			cskScore+=giveScore(st);
		}
		System.out.println("\n\t\t\t\t\t\t    -------> CSK got a score of "+cskScore+" <-------\t\t\t\t\t\t\n");
		fr=new FileReader("rcb.txt");
		br=new BufferedReader(fr);
		while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line);
			rcbScore+=giveScore(st);
		}
		System.out.println("\n\t\t\t\t\t\t    -------> RCB got a score of "+rcbScore+" <-------\t\t\t\t\t\t\n\n");
		if(cskScore>rcbScore) System.out.println("\n\t\t\t\t\t\t<<<<<<\t\tCSK WON THE MATCH\t    >>>>>>\t\t\t\t\t\t\n");
		else System.out.println("\n\t\t\t\t\t\t<<<<<<\t\tRCB WON THE MATCH\t    >>>>>>\t\t\t\t\t\t\n");
		fr.close();
		br.close();
	}
}
