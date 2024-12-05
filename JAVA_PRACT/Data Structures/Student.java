class Student{
	String name;
	int roll;
	Student next;
	Student(String n,int r){
		this.name=n;
		this.roll=r;
		next=null;
	}
	public String toString(){
		return name+" "+roll;
	}
}
