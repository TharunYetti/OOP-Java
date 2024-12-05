class OverLoad{
	void m1(){
		System.out.println("No parameter");
	}
	void m1(int z){
		System.out.println("Integer: "+z);
	}
	void m1(int z,int y){
		System.out.println("Int: "+z+" Int: "+y);
	}
	void m1(String name){
		System.out.println("Name: "+name);
	}
	void m1(String name,int z){
		System.out.println("Name: "+name+" Int: "+z);
	}
}


