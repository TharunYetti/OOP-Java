import java.util.Scanner;
class SumOfNums{
	int a,b;
	void getInput(){
		Scanner scan=new Scanner(System.in);
		System.out.print("ENter two numbers(space between):");
		a=scan.nextInt();
		b=scan.nextInt();
	}
	void compute(){
		System.out.println("The sum of two numbers is "+(a+b));
	}
}
