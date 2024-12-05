import java.util.*;
class Producer extends Thread{
	Buffer pb1;
	Producer(Buffer b){
		this.pb1=b;
	}
	public void run(){
		Random r=new Random();
		for(int i=0;i<10;i++){
			int ele=r.nextInt(100);
			pb1.insert(ele);
			System.out.println("Element inserted: "+ele);
		}
	}
}
