class Circle{
	double x,y,r;
	public Circle(double x,double y,double r)throws InvalidRadiusException{
		if(r<=0){
			throw new InvalidRadiusException(r);
		}
		else{
			this.x=x;
			this.y=y;
			this.r=r;
		}
	}
	
}
