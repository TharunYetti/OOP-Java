class AgeException extends Exception{
	int age;
	AgeException(int n){
		this.age=n;
	}
	public String toString(){
		return "AgeException for age "+age;
	}
}
