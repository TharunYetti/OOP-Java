class Laptop{
	String mName,sNo;
	double price;
	Laptop next;
	Laptop(String mn,String sno,double p){
		this.mName=mn;
		this.sNo=sno;
		this.price=p;
		this.next=null;
	}
	public String toString(){
		return mName+" "+sNo+" "+price;
	}
}
