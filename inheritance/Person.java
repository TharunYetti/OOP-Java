class Person{
	String name,prof;
	int age;
	Person(String name,int age,String prof){
		this.name=name;
		this.age=age;
		this.prof=prof;
	}
	void printData(){
		System.out.println("Name:"+name);
		System.out.println("Profession:"+prof);
		System.out.println("Age:"+age);
	}
	void canWork(){
		System.out.println(name+" can work!");
	}
	
}
