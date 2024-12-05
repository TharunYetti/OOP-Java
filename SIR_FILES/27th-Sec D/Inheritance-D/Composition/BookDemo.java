import java.io.*;
import java.util.*;
class BookDemo{
	public static void main(String args[])throws IOException{
		/*Author apj=new Author("APJ","apj@India",'M');
		System.out.println(apj);
		Book b1=new Book("WingsOfFire",apj,150,500);
		System.out.println(b1);
		b1.setPrice(200);
		b1.getAuthor().setEmail("kalam@India") ;
		String bName=b1.getName();
		double cost=b1.getPrice();
		System.out.println("Book Name: "+bName+" Cost: "+cost);
		//apj.setEmail();
		System.out.println(b1);
		System.out.println(apj); */
		 Book library[]=new Book[50];
		 int count=0;
		FileReader fr=new FileReader("unsorted.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		StringTokenizer st=null;
		while((line=br.readLine())!=null){
			System.out.println(line);
			st=new StringTokenizer(line);
			String bn=st.nextToken();
			String an=st.nextToken();
			String am=st.nextToken();
			String ag=st.nextToken();
			char gen=ag.charAt(0);
			String pr=st.nextToken();
			double price=Double.parseDouble(pr);
			int qty=Integer.parseInt(st.nextToken());
			Author a1=new Author(an,am,gen);
			library[count]=new Book(bn,a1,price,qty);
			count++;
			
		}
		br.close();
		fr.close();
		
		for(int i=0;i<count;i++){
			System.out.println(library[i]);
		}
		for(int i=0;i<count;i++){
			for(int j=0;j<count-1;j++){
				if(library[j].getName().compareTo(library[j+1].getName())>0){
					Book temp=library[j];
					library[j]=library[j+1];
					library[j+1]=temp;
				}
			}
		}
		 FileWriter fw=new FileWriter("sorted.txt");
		 BufferedWriter bw=new BufferedWriter(fw);
		bw.write("----------- After Sorting------------\n");
		for(int i=0;i<count;i++){
			bw.write(library[i]+"\n");
		}
		bw.close();
		fw.close();
	}
}
