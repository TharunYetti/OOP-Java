import java.io.*;
import java.util.*;
public class AuthorDemo{
	public static void main(String args[])throws IOException{
		FileReader fr=new FileReader("data.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		StringTokenizer st=null;
		Book b1=null;
		Book b[]=new Book[20];
		int i=0;
		while((line=br.readLine())!=null){
			System.out.println(line);
			st=new StringTokenizer(line);
			if(st.hasMoreTokens()){
				String bName=st.nextToken();
				String authname=st.nextToken();
				String mail=st.nextToken();
				String gen=st.nextToken();
				char c=gen.charAt(0);
				float price=Float.parseFloat(st.nextToken());
				int qty=Integer.parseInt(st.nextToken());
				int pages=Integer.parseInt(st.nextToken());
				Author au=new Author(authname,mail,c);
				b[i]=new Book(bName,au,price,qty,pages);
				i++;
			}
		}
		for(int j=0;j<i;j++){
			for(int k=0;k<i-1;k++){
				if(b[k].getAuthor().getName().compareTo(b[k+1].getAuthor().getName())>0){
					Book temp=b[k];
					b[k]=b[k+1];
					b[k+1]=temp;	
				}
			}
		}
		for(int j=0;j<i;j++){
			System.out.println(b[j]);
		}
	}
}
