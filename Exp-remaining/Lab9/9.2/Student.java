class Student{
	String name,reason;
	int maxLeaveDays;
	Student(String n,int a,String m){
		this.name=n;
		this.maxLeaveDays=a;
		this.reason=m;
	}
	public String toString(){
		return name+" "+maxLeaveDays+" "+reason;
	}
}
