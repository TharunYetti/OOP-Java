class OverLoadingDemo{
	public static void main(String args[]){
		OverLoading obj1=new OverLoading();
		OverLoading obj2=new OverLoading(20,20);
		obj2.compute();
		obj2.compute(70);
		obj2.compute(10,10);
		obj2.printData();
	}
}
