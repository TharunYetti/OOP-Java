import java.util.Scanner;
import java.lang.Math;
class Armstrong{
	int n;
	void getInput(){
		System.out.print("Enter a number:");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
	}
	void compute(){
		int c=0,dig,len=0,temp=n,temp2=n;
		double t,sum=0;
		while(temp!=0){
			c=c+1; temp/=10;
		}
		while(n!=0){
			dig=n%10;
			t=Math.pow(dig,c); sum=sum+t;
			n=n/10;
		}
		if(sum==temp2) System.out.println(temp2+" is armstrong number");
		else System.out.println(temp2+" is not a Armstrong number");
	}
}







