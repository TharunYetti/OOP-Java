import java.util.*;
import java.io.*;
class AmazonStoreApp{
	public static void main(String args[])throws IOException{
		AmazonStore as=new AmazonStore();
		FileReader fr=new FileReader("laptops.txt");
		BufferedReader br=new BufferedReader(fr);
		StringTokenizer st=null;
		String line="";
		while((line=br.readLine())!=null){
			st=new StringTokenizer(line);
			if(st.hasMoreTokens()){
				String cn=st.nextToken(), mn=st.nextToken();
				double p=Double.parseDouble(st.nextToken());
				as.add(cn,mn,p);
			}
		}
		br.close();	fr.close();
		System.out.println("--------------- WELCOME TO AMAZONSTORE APP ------------------");
		System.out.println("The available Laptops and their models are\n");
		as.display();
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------------------\n1.To add new Laptop Details into the Shop\n2.To display all available Laptops\n3.Update Laptop model Name\n4.Remove one Laptop Details from Shop\n5.to sort\nOther to exit();\nENter your choice:");
		int ch=Integer.parseInt(br.readLine());
		do{
			switch(ch){
				case 1:{
					System.out.println("Enter the Model name of the Laptop:");
					String mn=br.readLine();
					System.out.println("Enter the Serial No of the Laptop:");
					String sno=br.readLine();
					System.out.println("Enter the price of the Laptop:");
					double p=Double.parseDouble(br.readLine());
					as.add(mn,sno,p);
					//System.out.println("Laptop is added to the cart!!!");
				}break;
				case 2:{
					as.display();
				}break;
				case 3:{
					System.out.println("Enter the Serial Number of the Laptop to be updated:");
					String sno=br.readLine();
					System.out.println("Enter the new Serial Number for that Laptop:");
					String nsno=br.readLine();
					as.update(sno,nsno);
				}break;
				case 4:{
					System.out.println("Enter the Serial Number of the Laptop to be deleted:");
					String sno=br.readLine();
					as.remove(sno);
				}break;
				case 5:{
					as.sort();
				}
			}
			System.out.println("------------------------------------------------------\n1.To add new Laptop Details into the Shop\n2.To display all available Laptops\n3.Update Laptop model Name\n4.Remove one Laptop Details from Shop\n5.to sort\nOther to exit();\nENter your choice:");
			ch=Integer.parseInt(br.readLine());
		}while(ch>=1 && ch<=5);
	}
}
