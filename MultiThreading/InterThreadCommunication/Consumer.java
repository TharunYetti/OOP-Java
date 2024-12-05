class Consumer extends Thread{
	Buffer cb1;
	Consumer(Buffer b){
		this.cb1=b;
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Element accessed: "+cb1.pop());
		}
	}
}
