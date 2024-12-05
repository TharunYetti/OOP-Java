class A{
	public synchronized void m1(B b){
		System.out.println("A is started");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		b.last();
		System.out.println("Leaving A");
	}
	synchronized void last(){
		System.out.println("Last...from A");
	}
}
