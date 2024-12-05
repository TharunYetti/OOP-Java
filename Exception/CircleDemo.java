class CircleDemo{
	public static void main(String args[])throws InvalidRadiusException{
		try{
			Circle c1=new Circle(10,10,-1);
			System.out.println("Circle Created");
		}catch(InvalidRadiusException ire){
			System.out.println(ire);
		}
	}
}
