class Person{
	String name;
	int age;
	String prof;
	 Person(String name,int age,String pro)
	 {
		 this.name=name;
		 this.age=age;
		 this.prof=pro;
		 
	 }
	void printData()
	{
		System.out.println("Name: "+name+" Age: "+age+" Profession: "+prof);
	}
	void canWork(){
		System.out.println(name+" is a Person and he can work...");
	}
}
