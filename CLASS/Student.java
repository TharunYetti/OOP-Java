class Student{
	String name;
	int age;
	private float cgpa;
	String id;
	void canRead(){
		System.out.println("Every student can read");
	}
	void canPlay(){
		System.out.println("EVery stduent can play");
	}
	void printData(){
		System.out.println("Name:"+name+"\nAge:"+age+"\ncgpa:"+cgpa+"\nID:"+id);
	}
	void setCgpa(float n){
		cgpa=n;
	}
}
