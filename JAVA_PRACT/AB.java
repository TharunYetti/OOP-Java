class AB{
	public static void main(String args[]){
		A t1=new A();
		B t2=new B();
		t1.setPriority(10);
		t2.setPriority(1);
		t2.start();
		t1.start();
		//t1.suspend();
		//t1.resume();
	
	}
}
