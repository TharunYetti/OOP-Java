class B extends A{
	B(int a,int b){
		super(a);
		System.out.println(b);
	}
	void m2(){
		//super.m2();
		System.out.println("m2 method from class B");
	}
	void m3(){
		System.out.println("m3 method from class B");
	}
}
