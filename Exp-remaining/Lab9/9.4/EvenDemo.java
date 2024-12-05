class EvenDemo{
	public static void main(String args[]){
		int n=20;
		Buffer b=new Buffer();
		EvenGen eg=new EvenGen(b,n);
		WriteData wd=new WriteData(b,n);
		eg.start();
		wd.start();
	}
}
