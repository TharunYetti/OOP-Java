import java.io.*;
class WriteData extends Thread{
	Buffer b;
	int n;
	WriteData(Buffer b,int n){
		this.b=b;
		this.n=n;
	}
	public void run(){
		try{
			FileWriter fw=new FileWriter("even.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=1;i<=n/2;i++){
				bw.write(b.pop()+"\n");
				System.out.println("ELement inserted");
			}
			bw.close();
			fw.close();
		}catch(Exception ie){};
	}
}
