import java.util.Scanner;
class LeapOrNot{
	int year;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the year:");
		year=read.nextInt();
	}
	void compute(){
		if(year%100==0 && year%400==0)
			System.out.println(year+" is a Leap year");
		else if(year%4==0)
			System.out.println(year+" is a Leap year");
		else
			System.out.println(year+" is Not a Leap year");
	}
}
