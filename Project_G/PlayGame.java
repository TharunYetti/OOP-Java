import java.util.*;
import java.io.*;
class PlayGame{
	Scanner sc=new Scanner(System.in);
	void startTheGame(String name,String word,String file)throws IOException{
		int score=0;
		StringBuffer outWord=new StringBuffer();;
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==' '){
				System.out.print("  ");
				outWord.append(' ');
			}
			else{
				System.out.print("- ");
				outWord.append('-');
			}
		}
		System.out.println("\n");
		char c;
		while(outWord.indexOf("-")!=-1){
			System.out.print("Enter the letter:");
			c=sc.nextLine().charAt(0);
			if(c>=97 && c<=122) c-=32;
			int pos=-1;
			for(int i=0;i<word.length();i++){
				if(c==word.charAt(i) && outWord.charAt(i)=='-') pos=i;
			}
			if(pos!=-1){
				score+=10;
				System.out.println("You are Correct!\n");
				outWord.replace(pos,pos+1,Character.toString(word.charAt(pos)));
			}
			else{
				score-=10;
				System.out.println("Ohh! You missed\n");
			}
			for(int i=0;i<word.length();i++) System.out.print(outWord.charAt(i)+" ");
			String s="Score : "+score;
			System.out.printf("%100s\n",s);
		}
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("\nName : "+name+"\tScore Percentage : "+( (double)score/( word.length()*10 ) )*100 );
		bw.close(); fw.close();
	}
}
