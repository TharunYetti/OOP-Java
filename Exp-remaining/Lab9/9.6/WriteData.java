import java.io.*;
class WriteData extends Thread{
	Buffer b;
	WriteData(Buffer b){
		this.b=b;
	}
	public void run(){
		try{
			FileWriter fw=new FileWriter("odd.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			//int k=n/2,i=1;
			//if(n%2==1) k=n/2+1;
			while(b.status){
				bw.write(b.pop()+"\n");
				System.out.println("ELement inserted");
			}
			bw.close();
			fw.close();
		}catch(Exception ie){};
	}
}
