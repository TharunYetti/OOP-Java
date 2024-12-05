import java.io.*;
class BookKeeper extends Thread{
	Customer c;
	int n;
	BookKeeper(Customer c,int n){
		this.c=c;
		this.n=n;
	}
	public void run(){
		try{
			FileWriter fw=new FileWriter("hotel.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=1;i<=n;i++){
				bw.write(c.read()+"\n");
				System.out.println("Data Written");
			}
			bw.close();
			fw.close();
		}catch(Exception e){}
	}
}
