import java.io.*;
class Receptionist extends Thread{
	Customer c;
	int n;
	Receptionist(Customer c,int n){
		this.c=c;
		this.n=n;
	}
	public void run(){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			for(int i=1;i<=n;i++){
				System.out.print("Enter your name:");
				String name=br.readLine();
				System.out.print("Enter your age:");
				int age=Integer.parseInt(br.readLine());
				System.out.print("Enter your maiId:");
				String mail=br.readLine();
				c.add(name,age,mail);
			}
		}catch(Exception e){}
	}
}
