import java.util.Scanner;
class PrimeCheck{
	int n;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=read.nextInt();
	}
	void compute(){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is Not a Prime Number");
	} 
}
