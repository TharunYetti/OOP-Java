import java.io.*;
import java.util.*;
class FileRead{
	public static void main(String args[])throws IOException
	{
			FileReader fr=new FileReader("info.txt");
			BufferedReader br=new BufferedReader(fr);
			//
			String line="";
			StringTokenizer st=null;
			String words[]=new String[200];
			int count=0;
			while((line=br.readLine())!=null)
			{
					st=new StringTokenizer(line);
					while(st.hasMoreTokens())
					{
						  String word=st.nextToken();
						  words[count]=word;
						  count++;
						  //System.out.println(word);
				  }
				//System.out.println(line);
			}
			br.close();
			fr.close();
			for(int i=0;i<count;i++)
			{
				for(int j=0;j<count-1;j++)
				{
					if(words[j].compareTo(words[j+1])>0)
					{
						String temp=words[j];
						words[j]=words[j+1];
						words[j+1]=temp;
					}
				}
			}
			FileWriter fw=new FileWriter("sorted.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			for(int i=0;i<count;i++)
			{
				bw.write((i+1)+". "+words[i]+"\n");
			}
			bw.close();
			fw.close();
			
			for(int i=0;i<count;i++)
			{
				System.out.println(words[i]+"--"+words[i].length());
				for(int j=0;j<words[i].length();j++)
				{
					char c=words[i].charAt(j);
					int z=(int)c;
					System.out.println(c+"--"+z);
					
				}
			}
	}
}
