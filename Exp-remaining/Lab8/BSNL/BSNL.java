import java.util.*;
import java.io.*;
class BSNL{
	public static void main(String args[])throws IOException{
		SubscriberList sl=new SubscriberList();
		FileReader fr=new FileReader("bsnl.txt");
		BufferedReader br=new BufferedReader(fr);
		StringTokenizer st=null;
		String line="";
		while((line=br.readLine())!=null){
			st=new StringTokenizer(line);
			if(st.hasMoreTokens()){
				String cn=st.nextToken();
				String mn=st.nextToken();
				int p=Integer.parseInt(st.nextToken());
				sl.add(cn,mn,p);
			}
		}
		br.close();fr.close();
		System.out.println("--------------- WELCOME TO BSNL ( CONNECTING INDIA ) ------------------");
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.To search the SubscriberID\n2.Remove one SubscriberID\n3.to sort\nOther to exit();\nENter your choice:");
		int ch=Integer.parseInt(br.readLine());
		do{
			switch(ch){
				case 1:{
					System.out.println("Enter the Subscriber ID:");
					String sid=br.readLine();
					sl.search(sid);
				}break;
				case 2:{
					System.out.println("Enter the Subscriber ID:");
					String sid=br.readLine();
					sl.remove(sid);
				}break;
				case 3:{
					sl.sort();
				}break;
				default:break;
			}
			System.out.println("------------------------------------------------------\n1.To search the SubscriberID\n2.Remove one SubscriberID\n3.to sort\nOther to exit();\nENter your choice:");
			ch=Integer.parseInt(br.readLine());
		}while(ch>=1 && ch<=3);
		sl.updateList("bsnl.txt");
		System.out.println("BSNL Subcribers List is Updated");
	}
}
