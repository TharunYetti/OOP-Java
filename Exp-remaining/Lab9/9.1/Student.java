class Student{
	String name,mail;
	int age;
	Student(String n,int a,String m){
		this.name=n;
		this.age=a;
		this.mail=m;
	}
	public String toString(){
		return name+" "+age+" "+mail;
	}
}
