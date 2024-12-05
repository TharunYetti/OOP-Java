import java.io.*;
class WriteData extends Thread{
	Buffer b;
	WriteData(Buffer b){
		this.b=b;
	}
	public void run(){
		try{
			FileWriter fw=new FileWriter("prime.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			while(b.status){
				bw.write(b.pop()+"\n");
				System.out.println("Element inserted");
			}
			bw.close();
			fw.close();
		}catch(Exception e){};
	}
}
