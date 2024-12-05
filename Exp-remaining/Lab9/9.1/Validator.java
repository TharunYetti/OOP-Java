import java.io.*;
import java.util.*;
class Validator extends Thread{
	StudentBuffer sb;
	int n;
	Validator(StudentBuffer s,int n){
		this.sb=s;
		this.n=n;
	}
	public void run(){
		try{
			FileWriter fw=new FileWriter("StudentDetails.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=1;i<=n;i++){
				Student s=sb.pop();
				try{
					if(s.age>23 && s.age<35){
						throw new AgeException(s.age);
					}
					else{
						bw.write(s+"\n");
						System.out.println("Accessed:"+s);
					}
				}catch(AgeException ae){
					System.out.println(ae);
				}
			}
			bw.close();
			fw.close();
		}catch(Exception e){}
	}
}
