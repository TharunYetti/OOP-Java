class Flight{
	String id;
	String source;
	String destination;
	int seatCount;
	double price;
	Flight(String id,String s,String d,int se,double pr){
		this.id=id;
		this.source=s;
		this.destination=d;
		this.seatCount=se;
		this.price=pr;
	}
	public String toString()
	{
		return id+" "+source+" "+destination+" "+seatCount+" "+price;
	}
}
