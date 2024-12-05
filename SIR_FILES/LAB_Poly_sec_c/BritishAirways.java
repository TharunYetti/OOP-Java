import java.io.*;
import java.util.*;
class BritishAirways  implements FlightOperations{
    
	TicketBooking currentTicket;
	Flight flights[]=new Flight[20];
	int count=0;
    //BritishAirways(String name,int age,char gen,String s,String d,double charge,String mail){
		//super(name,age,gen,s,d,charge,mail);
	
	 public void getAllAvailableFlights(){
		System.out.println("-----------Available Flights---------");
		try{
			FileReader fr=new FileReader("flights.txt");
			BufferedReader br=new BufferedReader(fr);
			String line="";
			StringTokenizer st=null;
			
			while((line=br.readLine())!=null){
				st=new StringTokenizer(line);
				String id=st.nextToken();
				String source=st.nextToken();
				String desti=st.nextToken();
				int capacity=Integer.parseInt(st.nextToken());
				double price=Double.parseDouble(st.nextToken());
				flights[count++]=new Flight(id,source,desti,capacity,price);
			}
			br.close();
			fr.close();
		}catch(Exception e){}		
		/*
		for(int i=0;i<count;i++){
			System.out.println(flights[i]);
		}
		*/
			
	}
	public void booking(TicketBooking obj,String fid){
		this.currentTicket=obj;
		for(int i=0;i<count;i++){
			if(flights[i].id.equals(fid)){
				if(currentTicket.seatCount>flights[i].seatCount){
					System.out.println("No.of sets requested are greater than the available seats.");
				}
				else{
					flights[i].seatCount-=currentTicket.seatCount;
					currentTicket.status=true;
					currentTicket.charge=flights[i].price*currentTicket.seatCount;
					currentTicket.source=flights[i].source;
					currentTicket.destination=flights[i].destination;
					break;
				}
			}
		}
		if(currentTicket.status==true){
			System.out.println("Your Seat(s) is/are booked....TicketDetails..."+currentTicket);
				
		}
		else{
			System.out.println("Invalid id/exeeding the no.of available seats");
		}
		
	}
	public void showFlights(){
		for(int i=0;i<count;i++){
			System.out.println(flights[i]);
		}
	}
	public void updateInfo(){
		try{
			FileWriter fw=new FileWriter("flights.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<count;i++){
				bw.write(flights[i]+"\n");
				//System.out.println(flights[i]);
			}
			bw.close();
			fw.close();
		}catch(Exception e){}
	}	
}
