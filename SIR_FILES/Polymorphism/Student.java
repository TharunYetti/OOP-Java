class Student extends Person
{
	  String id;
	  float cgpa;
	  Student(String name,int age,String pro,String id,float cg)
	  {
		  super(name,age,pro);
		  this.id=id;
		  this.cgpa=cg;
		  
	  }
	  void printData(){
		 System.out.println("Id: "+id+" Name: "+name+" Age: "+age+" Cgpa: "+cgpa+"Want to be: "+prof);
	  }  
	  void writeExam(){
		System.out.println(name+" is a student.. should be attended for exams");
	  }
	  
}
