class PrimeException extends Exception{
	int num;
	PrimeException(int n){
		this.num=n;
	}
	public String toString(){
		return "Exception: PrimeException-->"+num;
	}
}
