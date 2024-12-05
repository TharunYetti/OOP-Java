import java.util.*;
import java.io.*;
class CaesarCipher{
	public static String encrypt(String input,int key){
		String temp="";
		for(int i=0;i<input.length();i++){
			char c=input.charAt(i);
			int asc=c,upperbound=0,isAlpha=0;
			if( c>=65 && c<=90  ){
				asc=c+key;
				upperbound=90;
				isAlpha=1;
			}
			else if(c>=98 && c<=122){
				asc=c+key;
				upperbound=122;
				isAlpha=1;
			}
			else asc=c;
			if(asc>upperbound && isAlpha==1) asc=asc-26;
			temp+=(char)asc;
		}
		return temp;
	}
	public static void main(String args[])throws IOException{
		FileReader fr=new FileReader("demo.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("new.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		StringTokenizer st=null;
		String line="";
		int key=23;
		while((line=br.readLine())!=null){
			st=new StringTokenizer(line);
			while(st.hasMoreTokens()){
				String word=encrypt(st.nextToken(),key);
				bw.write(word+" ");
			}
			bw.write("\n");
		}
		br.close();
		fr.close();
		bw.close();
		fw.close();
		System.out.println("key is " + key + "\nencrypted");
	}
}
