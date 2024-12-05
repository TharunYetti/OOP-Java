class PCTDemo{
	public static void main(String args[]){
		Buffer b1=new Buffer();
		Producer p1=new Producer(b1);
		Consumer c1=new Consumer(b1);
		p1.start();
		c1.start();
	}
}
