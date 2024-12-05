class Student extends Person//using extends keywords to aquire the properties of Person class ---> Inheritancess
{
	int id;
	Student(String name,int age,String prof,int id){
		super(name,age,prof);
		this.id=id;
	}
	void printData(){
		System.out.println("Id:"+id+"\nName:"+name);
	}
}
