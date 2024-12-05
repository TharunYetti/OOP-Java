import java.io.*;
import java.util.*;
public class AuthorDemo{
	public static void main(String args[]) throws IOException
	{
		    FileReader fr=new FileReader("data.txt");
		    BufferedReader br=new BufferedReader(fr);
		    String line="";
		    StringTokenizer st=null;
		    Book cart[]=new Book[20];
		    int count=0;
		    Book b2=null;
		    while((line=br.readLine())!=null){
				//System.out.println(line);
				st=new StringTokenizer(line);
				while(st.hasMoreTokens()){
					String bName=st.nextToken();
					String authName=st.nextToken();
					String mail=st.nextToken();
					String gen=st.nextToken();
					char c=gen.charAt(0);
					String val=st.nextToken();
					float price=Float.parseFloat(val);
					int qty=Integer.parseInt(st.nextToken());
					int pages=Integer.parseInt(st.nextToken());
					Author au=new Author(authName,mail,c);
					cart[count]=new Book(bName,au,price,qty,pages);
					count++;
					
				}
			}
		
			for(int i=0;i<count;i++){
				for(int j=0;j<count-1;j++){
					if(cart[j].getAuthor().getName().compareTo(cart[j+1].getAuthor().getName())>0)
					{
						Book temp=cart[j];
						cart[j]=cart[j+1];
						cart[j+1]=temp;
					}
				}
			}
		
		     System.out.println("----------After Sort------------\n");
			for(int i=0;i<count;i++){
				System.out.println(cart[i]);
			}
		    
	}
}
