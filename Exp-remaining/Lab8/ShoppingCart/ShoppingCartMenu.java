import java.util.*;
import java.io.*;
public class ShoppingCartMenu{
	public static void main(String args[])throws IOException{
		ShoppingCart rkvCart=new ShoppingCart();
		FileReader fr=new FileReader("items.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		StringTokenizer st=null;
		while((line=br.readLine())!=null){
			st=new StringTokenizer(line);
			if(st.hasMoreTokens()){
				String pid=st.nextToken(),name=st.nextToken();
				double price=Double.parseDouble(st.nextToken());
				int qty=Integer.parseInt(st.nextToken());
				rkvCart.add(pid,name,price,qty);
			}
		}
		br.close();
		fr.close();
		System.out.println("--------------- WELCOME TO SHOPPING CART ------------------");
		System.out.println("The available Items are\n");
		rkvCart.display();
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("------------------------------------------------------\n1.To add new Item into the Shop\n2.To display all available Items\n3.Update Item quantity\n4.Remove one Item from Shop\n5.to sort\nOther to exit();\nENter your choice:");
		int ch=Integer.parseInt(br.readLine());
		do{
			switch(ch){
				case 1:{
					System.out.println("Enter the Product Id:");
					String pi=br.readLine();
					System.out.println("Enter the product name:");
					String pn=br.readLine();
					System.out.println("Enter the price of the product:");
					double pr=Double.parseDouble(br.readLine());
					System.out.println("Enter quantity:");
					int q=Integer.parseInt(br.readLine());
					rkvcart.add(pi,pn,pr,q);
				}break;
				case 2:{
					rkvCart.display();
				}break;
				case 3:{
					System.out.println("Enter the Product Id to be updated:");
					String pid=br.readLine();
					System.out.println("Enter the new quntity for that product:");
					String nq=br.readLine();
					rkvCart.update(pid,nq);
				}break;
				case 4:{
					System.out.println("Enter the Product Id to be deleted:");
					String sno=br.readLine();
					rkvCart.remove(sno);
				}break;
				case 5:{
					rkvCart.sort();
				}
			}
			System.out.println("------------------------------------------------------\n1.To add new Item into the Shop\n2.To display all available Items\n3.Update Item quantity\n4.Remove one Item from Shop\n5.to sort\nOther to exit();\nENter your choice:");
			ch=Integer.parseInt(br.readLine());
		}while(ch>=1 && ch<=5);
	}
}
