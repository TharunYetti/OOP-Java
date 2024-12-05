class Hotel{
	public static void main(String args[])throws InterruptedException{
		int customerCount=3;
		Customer c=new Customer();
		Receptionist r=new Receptionist(c,customerCount);
		BookKeeper bk=new BookKeeper(c,customerCount);
		r.start();
		bk.start();
		//r.join();
		//bk.join();
	}
}
