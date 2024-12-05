class OddDemo{
	public static void main(String args[]){
		int n=20;
		Buffer b=new Buffer();
		OddGen eg=new OddGen(b,n);
		WriteData wd=new WriteData(b);
		eg.start();
		wd.start();
	}
}
