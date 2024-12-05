import java.io.*;
import java.util.*;
class DataRead{
	public static void main(String args[])throws IOException
	{
		     FileReader fr=new FileReader("workshop.txt");
		     BufferedReader br=new BufferedReader(fr);
		     String line="";
		      int lines=0;
		      int wordCount=0;
		      String words[]=new String[100];
		     while((line=br.readLine())!=null)
		     {
				 //System.out.println("Line: "+line);
				 StringTokenizer st=new StringTokenizer(line);
				 while(st.hasMoreTokens()) {
							String word=st.nextToken();
							 words[wordCount]=word;
							wordCount++;
						}
					lines++;
			 }
			 System.out.println("Total Lines: "+lines);
			 System.out.println("Total Number of Words: "+wordCount);
			 for(int i=0;i<wordCount;i++){
				System.out.println(words[i]);
			 }
	}
}
