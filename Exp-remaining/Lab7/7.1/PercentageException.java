class PercentageException extends Exception{
	double percentage;
	PercentageException(double p){
		this.percentage=p;
	}
	public String toString(){
		return "Exception:PercentageException\n"+percentage;
	}
}
