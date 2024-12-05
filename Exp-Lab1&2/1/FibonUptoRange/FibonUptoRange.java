import java.util.Scanner;
class FibonUptoRange{
	int end;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the end of range:");
		end=read.nextInt();
	}
	void compute(){
		int a=0,b=1,temp;
		System.out.println("The fibonacci numbers are ");
		System.out.println(a);
		System.out.println(b);
		while((a+b)<=end){
			System.out.println(a+b);
			temp=a;
			a=b;
			b=temp+b;
		}
	}
}





