class B{
	public synchronized void m2(A a){
		System.out.println("B is started");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){}
		a.last();
		System.out.println("Leaving B");
	}
	synchronized void last(){
		System.out.println("Last...from B");
	}
}
