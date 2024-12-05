class Person{
	String name;
	int age;
	String prof;
	float height;
	String gen;
	Person(String name, int age,String prof,float height,String gen)
	{
		this.name=name;
		this.age=age;
		this.prof=prof;
		this.height=height;
		this.gen=gen;
	}  
	
	void printData()
	{
		System.out.println("Name: "+name+" Age: "+age+" Profession: "+prof+" Height: "+height);
	}
	void canWork(){
		System.out.println(name+" is person and he can work");
	}
	void canRun(){
		System.out.println(name+" is person and he can run..");
	}
}
