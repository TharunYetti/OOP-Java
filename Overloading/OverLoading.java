class OverLoading{
	int a,b;
	OverLoading(){
		a=1;
		b=2;
	}
	OverLoading(int a,int b){
		this.a=a;
		this.b=b;
	}
	void compute(){
		System.out.println("A="+a+"B="+b);
	}
	void compute(int x,int y){
		this.a=x;
		this.b=y;
		System.out.println("A="+a+"B="+b);
	}
	void compute(int y){
		this.b=y;
		System.out.println("A="+a+"B="+b);
	}
	void printData(){
		System.out.println("A="+a+"B="+b);
	}
}
