import java.util.*;
import java.io.*;
class BritishAirways implements FlightOperations{
	TicketBooking currentTicket;
	//BritishAirways(String name,int age,char gen,String source,String des,double charge,String mail){
		//super(name,age,gen,source,des,charge,mail);
	public static void main(String args[]){
		
	}
	public Flights[] getAllAvailableFlights(){
		System.out.println("------------Available FLights-------------");
		FileReader fr=new FileReader("FLights.txt");
		BUfferedReader br=new BufferedReader(fr);
		String line="";
		StringTokenizer st=null;
		Flights flights[]=new Flights[20];
		int count=0;
		while((line=br.nextLine())!=null){
			st=new StringTokenizer(line);
			String id=st.nextToken();
			String source=st.nextToken();
			String desti=st.nextToken();
			int capacity=Integr.parseInt(st.nextToken());
			double price=Double.parseDouble(st.nextToken());
			flights[count++]=new Flights(id,source,desti,capacity,price);
		}
		br.close();
		fr.close();
		return flights;
	}
	public void booking(TicketBooking obj){
		this.currentTicket=obj;
	}
}
