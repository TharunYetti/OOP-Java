import java.util.*;
class EvenOrOdd{
	int n;
	void getInput(){
		System.out.print("Enter a number");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
	}
	void compute(){
		if(n%2==0)
			System.out.println(n+" is EVEN");
		else
			System.out.println(n+" is ODD");
	}
}
