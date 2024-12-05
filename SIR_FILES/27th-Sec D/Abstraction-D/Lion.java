class Lion extends Animal{
	  Lion(String name,String id,String type,int age){
		  super(name,age,type,id);
	  }
	public void collectFood(){
		System.out.println("By Hunting...");
	}
	public void makeSound(){
		System.out.println(name+" Make Bigger roar...");
	}
	
}
