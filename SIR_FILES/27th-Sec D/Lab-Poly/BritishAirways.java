import java.io.*;
import java.util.*;
class BritishAirways implements FlightOperations{
	 TicketBooking tcb;
	 FlightInfo flights[]=new FlightInfo[20];
	 int count=0;
	public void getAllFlights(){
		try{
		FileReader fr=new FileReader("flights.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line);
			String id=st.nextToken();
			String s=st.nextToken();
			String d=st.nextToken();
			double price=Double.parseDouble(st.nextToken());
			int seats=Integer.parseInt(st.nextToken());
			 flights[count++]=new FlightInfo(id,s,d,price,seats);
		}
	}catch(Exception e){}
		   for(int i=0;i<count;i++){
				System.out.println(flights[i]);
		   }
		
	}
	public void bookTicket(TicketBooking tcb){
		this.tcb=tcb;
		
	}
}
