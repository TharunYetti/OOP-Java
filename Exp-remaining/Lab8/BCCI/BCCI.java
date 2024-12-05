import java.util.*;
import java.io.*;
class BCCI{
	public static void main(String args[])throws IOException{
		PlayerList pl=new PlayerList();
		FileReader fr=new FileReader("bcci.txt");
		BufferedReader br=new BufferedReader(fr);
		StringTokenizer st=null;
		String line="";
		while((line=br.readLine())!=null){
			st=new StringTokenizer(line);
			if(st.hasMoreTokens()){
				String n=st.nextToken();
				int tr=Integer.parseInt(st.nextToken());
				double avg=Double.parseDouble(st.nextToken());
				pl.add(n,tr,avg);
			}
		}
		br.close();fr.close();
		System.out.println("--------------- WELCOME TO BCCI ------------------");
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.To search the SubscriberID\n2.Remove one SubscriberID\n3.to sort\nOther to exit();\nENter your choice:");
		int ch=Integer.parseInt(br.readLine());
		do{
			switch(ch){
				case 1:{
					System.out.println("Enter the Name of the Player:");
					String n=br.readLine();
					pl.search(n);
				}break;
				case 2:{
					System.out.println("Enter the Name of the Player:");
					String n=br.readLine();
					pl.remove(n);
				}break;
				case 3:{
					pl.sort();
				}break;
			}
			System.out.println("------------------------------------------------------\n1.To search the SubscriberID\n2.Remove one SubscriberID\n3.to sort\nOther to exit();\nENter your choice:");
			ch=Integer.parseInt(br.readLine());
		}while(ch>=1 && ch<=3);
		pl.updateList("bcci.txt");
		System.out.println("Board is Updated");
	}
}
