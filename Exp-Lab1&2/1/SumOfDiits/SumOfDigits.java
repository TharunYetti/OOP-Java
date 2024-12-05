import java.util.Scanner;
class SumOfDigits{
	int n;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the Number:");
		n=read.nextInt();
	}
	void compute(){
		int temp=n,sum=0,dig;
		while(temp!=0){
			dig=temp%10;
			sum+=dig;
			temp/=10;
		}
		System.out.println("Sum of the digits of "+n+" is "+sum);
	}
}
