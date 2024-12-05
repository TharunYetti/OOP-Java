import java.util.Scanner;
class PrimeFactors{
	int n;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter a number:");
		n=read.nextInt();
	}
	void compute(){	
		System.out.println("The prime factors of "+n+" are ");
		for(int i=2;i<=n;i++){
			if(n%i==0){
				int count=0;
				for(int j=1;j<=i;j++){
					if(i%j==0) count++;
				}
				if(count==2) System.out.println(i);
			}
		}
	}
}
