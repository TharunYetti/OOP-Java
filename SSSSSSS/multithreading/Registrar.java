import java.io.*;
public class Registrar extends Thread{
	StudentBuffer sb;
	int count;	
	Registrar(StudentBuffer s,int n){
        	this.sb=s;
        	this.count=n;
    	}
    	public void run(){
        	try{
            		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            		for(int i=1;i<=count;i++){
		        	System.out.println("Enter the details:(name,id,age,mail):");
		        	String name=br.readLine();
		        	String id=br.readLine();
		        	int age=Integer.parseInt(br.readLine());
		        	String mail=br.readLine();
		        	Student s=new Student(name,id,age,mail);
		        	sb.insert(s);
		        }
        	}catch(Exception e){}
    	}
}
