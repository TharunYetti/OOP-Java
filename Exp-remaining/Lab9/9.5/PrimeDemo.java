class PrimeDemo{
	public static void main(String args[]){
		Buffer b=new Buffer();
		PrimeGen pg=new PrimeGen(b,50);
		WriteData wd=new WriteData(b);
		pg.start();
		wd.start();
	}
}
