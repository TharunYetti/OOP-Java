import java.util.*;
import java.io.*;
class HOD extends Thread{
	StudentBuffer sb;
	int n;
	HOD(StudentBuffer s,int n){
		this.sb=s;
		this.n=n;
	}
	public void run(){
		try{
			FileWriter fw=new FileWriter("Outpass.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=1;i<=n;i++){
				Student s=sb.pop();
				if(s!=null){
					bw.write(s+"\n");
					System.out.println("Accessed:"+s);
				}
			}
			bw.close();
			fw.close();
		}catch(Exception e){}
	}
}
