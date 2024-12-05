class Flights{
	String id;
	String source;
	String desti;
	int seatCount;
	double price;
	Fliht(String id,String s,String desti,int se,double p){
		this.id=id;this.source=s;this.desti=desti;this.seatCount=se;this.price=p;
	}
	public Strinf toString(){
		return "id:"+id+" Source:"+source+" Destination:"+desti+" Seat COunt:"+seatCount+" price:"+price;
	}
}
