classs TicketBooking{
	String name;
	int age;
	char gen;
	String source;
	String destination;
	double charge;
	String mail;
	boolean status;
	TicketBooking(String name,int age,char gen,String source,String des,double charge,String mail){
		this.name=name;this.gen=gen;this.age=age;this.source=source;this.destination=des;this.charge=charge;this.mail=mail;
		//status=false;
	}
	public String toString(){
		return "Name:"+name+" Age:"+age+" Gender:"+gen+" Source:"+source+" Destination:"+destination;
	}
}
