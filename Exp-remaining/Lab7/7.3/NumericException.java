class NumericException extends Exception{
	int num;
	NumericException(int n){
		this.num=n;
	}
	public String toString(){
		return "Exception: NumericException-->"+num;
	}
}
