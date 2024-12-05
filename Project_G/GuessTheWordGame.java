import java.io.*;
import java.util.*;
class GuessTheWordGame{
	static Random r=new Random();
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static String heroes[]={"PRABHAS","ALLU ARJUN","GOPICHAND","NITHIN","RAM","RAM CHARAN","VIJAY DEVARAKONDA","NTR","THARUN"};
	static String fruits[]={"GUAVA","APPLE","BANANA","MANGO","ORANGE","KIVI","GRAPES"};
	static String colours[]={"VIOLET","INDIGO","BLUE","GREEN","YELLOW","ORANGE","RED","WHITE","BLACK"};
	public static void main(String args[])throws IOException{
		System.out.println("\n\t\tGuess The Word Game\n --> Our AI will select a word from the list of words\n --> You have to guess it letter by letter\n --> We will give a clue regarding that word\n --> We also provide no.of letters in that word\n --> For each Correct letter you will get +10 marks\n --> For each wrong letter you will get -10 marks\n");
		System.out.print("Enter your name:");
		String name=br.readLine(),clue;
		int flag1=r.nextInt(1,4),flag2;
		PlayGame p1=new PlayGame();
		if(flag1==1){
			flag2=r.nextInt(heroes.length);
			clue="Name of a Tollywood Hero";
			System.out.println("All the Best "+name+"\n\n--> Your Clue : "+clue+"\n");
			p1.startTheGame(name,heroes[flag2],"outGame.txt");	
		}
		else if(flag1==2){
			flag2=r.nextInt(fruits.length);
			clue="Name of a Fruit";
			System.out.println("All the Best "+name+"\n\n--> Your Clue : "+clue+"\n");
			p1.startTheGame(name,fruits[flag2],"outGame.txt");
		}
		else{
			flag2=r.nextInt(colours.length);
			clue="Name of a Colour";
			System.out.println("All the Best "+name+"\n\n--> Your Clue : "+clue+"\n");
			p1.startTheGame(name,colours[flag2],"outGame.txt");
		}
	}
}
