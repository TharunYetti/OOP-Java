import java.util.*;
import java.io.*;
class Match extends IPL{
	static int balls,totalOvers=20,over,score;
	static Random r=new Random();
	static int oversForRunRate[]=new int[2],t=1,counter=0,fileCounter=1,oversForFile;
	static int giveScore(StringTokenizer st){
		balls=1;over=1;score=0;
		String striker=st.nextToken();
		String nonStriker=st.nextToken(),temp2="\t"+striker+" and "+nonStriker+" came into field";
		System.out.printf("%-50s",temp2);
		System.out.printf("\t\t\tBall:%d\t\t\tover:%d\t\t\tScore:%d\n",balls,over,score);
		int run=r.nextInt(1,10);
		while(st.hasMoreTokens() && over<=totalOvers){
			String temp="";
			switch(run){
				case 1:{temp2="\t"+striker+" gave one run!";
					System.out.printf("%-50s",temp2);
					score+=1;temp=striker;striker=nonStriker;nonStriker=temp;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 2:{temp2="\t"+striker+" and "+nonStriker+" gave TwoDee!";
					System.out.printf("%-50s",temp2);
					score+=2;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 3:{temp2="\t"+striker+" and "+nonStriker+" gave three runs!";
					System.out.printf("%-50s",temp2);
					score+=3;temp=striker;striker=nonStriker;nonStriker=temp;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 4:{temp2="\tYahooo!! "+striker+" hit a four";
					System.out.printf("%-50s",temp2);
					score+=4;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 5:{temp2="\t"+striker+" and "+nonStriker+" gave Five runs!";
					System.out.printf("%-50s",temp2);
					score+=5;temp=striker;striker=nonStriker;nonStriker=temp;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 6:{temp2="\tFantastic "+striker+"!! its a Boundary..SIXER!";
					System.out.printf("%-50s",temp2);
					score+=6;
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 7:{temp2="\tOhh It's a No ball";
					System.out.printf("%-50s",temp2);
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					}break;
				case 8:{temp2="\tIt's a Wide";
					System.out.printf("%-50s",temp2);
					if(!st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					score+=1;
					}break;
				case 9:{temp2="\t"+striker+" Out";
					System.out.printf("%-50s",temp2);
					striker=st.nextToken();
					if(balls==6){
						temp=striker;striker=nonStriker;nonStriker=temp;
						over++;balls=1;
					}
					else balls++;
					if(st.hasMoreTokens()||over<=totalOvers)
						System.out.printf("\t\t\tBall:%d\t\t\tOver:%d\t\t\tScore:%d\n",balls,over,score);
					System.out.println("\t"+striker+" came into ground");
					}break;
			}
			run=r.nextInt(1,10);
		}
		if(!st.hasMoreTokens()){
			System.out.println("\n	>>>>>> ALL OUT\n");
			oversForRunRate[counter]=over;
			if(counter==1) counter=0;
			else counter++;
		}
		else if(over>totalOvers){
			System.out.println("\n	>>>>>> OVERS COMPLETED");
			oversForRunRate[counter]=totalOvers;
			if(counter==1) counter=0;
			else counter++;
		}
		return score;
	}
	static String teamName(String s){
		if(s.equals("csk.txt")) return "CSK";
		else if(s.equals("dc.txt")) return "DC";
		else if(s.equals("gt.txt")) return "GT";
		else if(s.equals("kkr.txt")) return "KKR";
		else if(s.equals("lsg.txt")) return "LSG";
		else if(s.equals("mi.txt")) return "MI";
		else if(s.equals("pk.txt")) return "PK";
		else if(s.equals("rcb.txt")) return "RCB";
		else if(s.equals("rr.txt")) return "RR";
		else return "SRH";
		
	}
	public static String playMatch(String team1,String team2)throws IOException{
		FileReader fr=new FileReader(team1);;
		BufferedReader br=new BufferedReader(fr);;
		String line="";
		int team1Score=0,team2Score=0;
		double nrr=0;
		while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line);
			team1Score+=giveScore(st);
		}
		fr=new FileReader(team2);
		br=new BufferedReader(fr);
		while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line);
			team2Score+=giveScore(st);
		}
		br.close();
		fr.close();
		String fileWinner="";
		if(team1Score>team2Score){
			nrr=(team1Score-team2Score)/oversForRunRate[0];
			tl.updateRunRate(teamName(team1),nrr);
			fileWinner=team1;
			//return team1;
		}
		else{
			nrr=(team2Score-team1Score)/oversForRunRate[1];
			tl.updateRunRate(teamName(team2),nrr);
			fileWinner=team2;
			//return team2;
		}
		FileWriter fw=new FileWriter("score.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		if(t>2){
			bw.write("--------- FINAL MATCH SCORECARD ---------\n");
		}
		else if(fileCounter>45){
			bw.write("--------- SEMIFINAL Match "+t+" ScoreCard ---------\n");
			t++;
		}
		else{
			bw.write("--------- Match "+fileCounter+" ScoreCard ---------\n");
			fileCounter++;
		}
		bw.write("\t"+teamName(team1)+"\t Score:"+team1Score+"\tOvers:"+oversForRunRate[0]+"\n");
		bw.write("\t"+teamName(team2)+"\t Score:"+team2Score+"\tOvers:"+oversForRunRate[1]+"\n");
		bw.write("  Winner:"+teamName(fileWinner)+"\n\n");
		bw.close();
		fw.close();
		return fileWinner;
	}
}
