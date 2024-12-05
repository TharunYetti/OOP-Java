class NestedClass{
	static class nestClass{
		void method(){
			System.out.println("Hello");
		}
	}
	public static void main(String args[]){
		System.out.println("OK");
		nestClass a=new nestClass();
		a.method();
	}
}
