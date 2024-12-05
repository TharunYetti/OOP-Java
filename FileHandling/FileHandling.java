import java.util.*;
import java.io.*;
class FileHandling{
	public static void main(String args[])throws IOException{
		FileReader fr=new FileReader("/home/rguktrkvalley/Desktop/Java/FileHandling/data.txt");
		BufferedReader br=new BufferedReader(fr);
		String words[]=new String[591];
		int count=0;
		String ln="";
		while((ln=br.readLine())!=null){
			System.out.println(ln);
			StringTokenizer st=new StringTokenizer(ln);
			while(st.hasMoreTokens()){
				words[count]=st.nextToken();
				count++;
			}
		}
		for(int i=0;i<count;i++){
			System.out.println(words[i]);
		}
	}
}
