import java.util.*;
import java.io.*;
class Tollywood{
	public static void main(String args[])throws IOException{
		MovieList ml=new MovieList();
		FileReader fr=new FileReader("movies.txt");
		BufferedReader br=new BufferedReader(fr);
		StringTokenizer st=null;
		String line="";
		while((line=br.readLine())!=null){
			st=new StringTokenizer(line);
			if(st.hasMoreTokens()){
				String mn=st.nextToken();
				String hn=st.nextToken();
				String dn=st.nextToken();
				int rd=Integer.parseInt(st.nextToken());
				double gc=Double.parseDouble(st.nextToken());
				ml.add(mn,hn,dn,rd,gc);
			}
		}
		br.close();fr.close();
		System.out.println("--------------- WELCOME TO TOLLYWOOD INDUSTRY ------------------");
		System.out.println("The available Movies are\n");
		ml.display();
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------------------\n1.To add new Movie Details\n2.To search among all movies\n3.Remove one Movie\nOther to exit();\nENter your choice:");
		int ch=Integer.parseInt(br.readLine());
		do{
			switch(ch){
				case 1:{
					System.out.print("Enter the Movie Name:");
					String mn=br.readLine();
					System.out.print("Enter the Hero Name:");
					String hn=br.readLine();
					System.out.print("Enter the Director name:");
					String dn=br.readLine();
					System.out.print("ENter the release Date:");
					int rd=Integer.parseInt(br.readLine());
					System.out.print("Enter the grpss collections:");
					double gc=Double.parseDouble(br.readLine());
					ml.add(mn,hn,dn,rd,gc);
					//System.out.println("Mobile is added to the cart!!!");
				}break;
				case 2:{
					System.out.print("Enter the movie name to search:");
					String mn=br.readLine();
					ml.search(mn);
				}break;
				case 3:{
					System.out.println("Enter the Movie Name to be deleted:");
					String mn=br.readLine();
					ml.remove(mn);
				}break;
			}
			System.out.println("------------------------------------------------------\n1.To add new Movie Details\n2.To search among all movies\n3.Remove one Movie\nOther to exit();\nENter your choice:");
			ch=Integer.parseInt(br.readLine());
		}while(ch>=1 && ch<=3);
		ml.sortByGrossCollections();
		ml.update();
	}
}
