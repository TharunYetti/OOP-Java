class exam{
	int foo(int a,String b){
		a=a+2;
		b="Yellow";
		return a;
	}
	void b(){
		String s="Blue";
		int a=3;
		a=foo(a,s);
		System.out.println("a "+a+"s "+s);
	}
	public static void main(String args[]){
		exam e=new exam();
		e.b();
	}
}
