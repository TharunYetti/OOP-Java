class InnerClass{
	class inClass{
		void method(){
			System.out.println("Hello");
		}
	}
	public static void main(String args[]){
		InnerClass a=new InnerClass();
		InnerClass.inClass b=a.new inClass();
		b.method();
	}
}
