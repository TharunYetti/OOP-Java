import java.io.*;
public class Registrar extends Thread{
	StudentBuffer s1;
	int n;
	Registrar(StudentBuffer s,int n){
		this.s1=s;
		this.n=n;
	}
	public void run(){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			for(int i=1;i<=n;i++){
				System.out.println("Enter Student Details:");
				String name=br.readLine();
				int age=Integer.parseInt(br.readLine());
				String mail=br.readLine();
				Student s=new Student(name,age,mail);
				s1.insert(s);
			}
		}catch(IOException ioe){}
	}
}
