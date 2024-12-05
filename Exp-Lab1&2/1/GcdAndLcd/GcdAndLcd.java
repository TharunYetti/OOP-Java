import java.util.Scanner;
class Lcd{
	int n1,n2;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter two nums(space between)");
		n1=read.nextInt();
		n2=read.nextInt();
	}
	void compute(){
		int gcd=1,lcd;
		for(int i=2;(i<=n1 && i<=n2);i++){
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		lcd=(n1*n2)/gcd;
		System.out.println("The LCD of two number is "+lcd);
	}
}
