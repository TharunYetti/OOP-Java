class AgeException extends Exception{
	int age;
	AgeException(int a){
		this.age=a;
	}
	public String toString(){
		return "Age Exception";
	}
}
