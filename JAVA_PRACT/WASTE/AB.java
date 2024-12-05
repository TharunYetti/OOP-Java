class AB extends Thread{
	A a=new A();
	B b=new B();
	public void vv(){
		this.start();
		a.m1(b);
	}
	public void run(){
		b.m2(a);
	}
	public static void main(String argsp[]){
		AB t=new AB();
		t.vv();
	}
}
