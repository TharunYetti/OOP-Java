class overloading{
	int a,b;
	overloading(){
		a=1;
		b=2;
	}
	void compute(){
		System.out.println("A="+(a+1)+",B="+(b+1));
	}
	void compute(int x,int y){
		System.out.println("A="+(a+x)+",B="+(b+y));
	}
	
}
