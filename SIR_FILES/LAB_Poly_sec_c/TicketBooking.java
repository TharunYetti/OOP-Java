class TicketBooking{
	String name;
	int age;
	char gen;
	String source;
	int seatCount;
	String destination;
	double charge;
	String mail;
	boolean status;
	TicketBooking(String name,int age,char gen,String mail,int seatCount){
		this.name=name;
		this.age=age;
		this.gen=gen;
		this.mail=mail;
		this.seatCount=seatCount;
		//status=false;
	}
	public String toString(){
		   return "Name: "+name+" Source: "+source+" Destination: "+destination+" Status: "+status+" Price: "+charge;
	}
}
