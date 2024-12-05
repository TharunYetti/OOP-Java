import java.io.*;
import java.util.*;
class AirIndia implements FlightOperations{
	TicketBooking currentTicket;
	Flight flights[]=new Flight[20];
	int count=0;
	public void getAllAvailableFlights(){
		try{
			FileReader fr=new FileReader("AIflights.txt");
			BufferedReader br=new BufferedReader(fr);
			String line="";
			while((line=br.readLine())!=null){
				StringTokenizer st=new StringTokenizer(line);
				String id=st.nextToken();
				String source=st.nextToken();
				String desti=st.nextToken();
				int capacity=Integer.parseInt(st.nextToken());
				double price=Double.parseDouble(st.nextToken());
				flights[count++]=new Flight(id,source,desti,capacity,price);
			}
			br.close();fr.close();
		}catch(Exception e){}
	}
	public void booking(TicketBooking obj,String fid){
		this.currentBooking=obj;
		for(int i=0;i<count;i++){
			if(flights[i].id==fid){
				if(currentBooking.seatCount<=flights[i].seatCount){
					flights[i].seatCount-=currentBooking.seatCount;
					currentBooking.source=flights[i].source;
					currentBooking.destination=flights[i].destination;
					currentBooking.status=true;
				}
				else{
					System.out.println("Seats are not unavailable");
				}
			}
		}
		if(currentBooking.status){
			System.out.println("Ticket(s) Booked\nDetails--->"+currentBooking);
		}
		else{
			System.out.println("TIcket not booked as you have entered wrong input or exceeded the available seats");
		}
	}
	public void showFlights(){
		for(int i=0;i<count;i++){
			System.out.println(flights[i]);
		}
	}
	public void updateInfo(){
		try{
			FileWriter fw=new FileWriter("AIflights.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<count;i++){
				bw.write(flights[i]+"\n");
			}
			bw.close();fw.close();
		}catch(Exception e){}
	}
	
}