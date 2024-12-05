import java.io.*;
import java.util.*;
class WordPlay{
	static boolean isVowel(char c){
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') return true;
		return false;
	}
	static String replaceVowels(String word,char c){
		String newstr="";
		for(int i=0;i<word.length();i++){
			char z=word.charAt(i);
			if(isVowel(z)){
				if(i%2==0) newstr+=c;
				else newstr+='+';
			}
			else newstr+=z;
		}
		return newstr;
	}
	public static void main(String args[])throws IOException{
		FileReader fr=new FileReader("demo.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("new.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		StringTokenizer st=null;
		String line="";
		while((line=br.readLine())!=null){
			st=new StringTokenizer(line);
			while(st.hasMoreTokens()){
				String newstr=replaceVowels(st.nextToken(),'*');
				bw.write(newstr+" ");
			}
		}
		bw.write("\n");
		bw.close();
		fw.close();
		br.close();
		fr.close();
		System.out.println("Data written into new file");
	}
}
