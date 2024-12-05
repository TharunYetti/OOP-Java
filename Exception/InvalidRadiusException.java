class InvalidRadiusException extends Exception{
	double radius;
	InvalidRadiusException(double r){
		this.radius=r;
	}
	public String toString(){
		return "Exception: InvalidRadiusException-->"+radius;
	}
}
