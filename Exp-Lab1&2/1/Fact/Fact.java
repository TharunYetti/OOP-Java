import java.util.Scanner;
class Fact{
	int n;
	void getInput(){
		System.out.print("ENter a number:");
		Scanner read=new Scanner(System.in);
		n=read.nextInt();
	}
	void compute(){
		long fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("Factorial of "+n+" is "+fact);
	}
}
