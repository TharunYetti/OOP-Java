import java.util.Scanner;
class Perfect{
	int n;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the Number:");
		n=read.nextInt();		
	}
	void compute(){
		int sum=0;
		for(int i=1;i<n;i++) if(n%i==0) sum=sum+i;
		if(sum==n)
			System.out.println(n+" is a Perfect number");
		else
			System.out.println(n+" is not a perfect number");
	}
}z
