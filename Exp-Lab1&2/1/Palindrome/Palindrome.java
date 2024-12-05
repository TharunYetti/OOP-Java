import java.util.Scanner;
class Palindrome{
	int n;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the Number:");
		n=read.nextInt();		
	}
	void compute(){
		int temp=n,dig,rev=0;
		while(temp!=0){
			dig=temp%10;
			rev=rev*10+dig;
			temp=temp/10;
		}
		if(rev==n) System.out.println(n+" is a Palindrome");
		else System.out.println(n+" is not a Palindrome");
	}
}










