class FlightInfo{
	String fid;
	String fs;
	String fd;
	double price;
	int seats;
	FlightInfo(String fid,String fs,String fd,double price,int seats){
		this.fid=fid;
		this.fs=fs;
		this.fd=fd;
		this.price=price;
		this.seats=seats;
	}
	public String toString(){
		return "Flight Id: "+fid+" Source: "+fs+" Destination: "+fd+" Cost Per seat: "+price+" Total Seats: "+seats;
	}
}
