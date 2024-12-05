import java.io.*;
class FlightDemo{
	public static void main(String args[])throws IOException{
		//BritishAirways ba=new BritishAirways();
		FlightOperations fo=null;
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("-------------- WELCOME TO CSE TRIPS -------------\n");
		System.out.println("-------------------AVILABLE FLIGHT SERVICES----------------\n1.British Airways\n2.Air India\n3.TrueJet\n");
		int option=0;
		do{
			System.out.print("Select FLight serivces:");
			int s=Integer.parseInt(br.readLine());
			if(s==1){
				fo=new BritishAirways();
				fo.getAllAvailableFlights();
			}
			if(s==2){
				fo=new AirIndia();
				fo.getAllAvailableFlights();
			}
			if(s==3){
				fo=new TrueJet();
				fo.getAllAvailableFlights();
			}
			int choice=0;
			do{
				fo.showFlights();
				System.out.print("Enter Flight ID.:");
				String fno=br.readLine();
				System.out.print("How Many Seats Do You Want:");
				int seats=Integer.parseInt(br.readLine());
				System.out.print("Enter Name:");
				String name=br.readLine();
				System.out.print("Enter Age:");
				int age=Integer.parseInt(br.readLine());	
				System.out.print("Enter Gender:");
				char gen=br.readLine().charAt(0);
				System.out.print("Enter Mail:");
				String mail=br.readLine();
				TicketBooking currentBooking=new TicketBooking(name,age,gen,mail,seats);
				fo.booking(currentBooking,fno);
				System.out.println("Updated flights info");
				fo.showFlights();
				System.out.print("Do you want to book another ticket under BritishAirways?(1-yes,0-no) :");
				choice=Integer.parseInt(br.readLine());
				if(choice!=1) fo.updateInfo();
			}while(choice==1);
			System.out.print("Do you want to continue?(1-yes,0-no):");
			option=Integer.parseInt(br.readLine());
		}while(option==1);
	}
	
}
