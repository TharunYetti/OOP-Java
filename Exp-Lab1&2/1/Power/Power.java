import java.util.Scanner;
class Power{
	float base,exp;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter base and exponent(space between):");
		base=read.nextFloat();exp=read.nextFloat();
	}
	void compute(){
		float pow=1;
		for(int i=1;i<=exp;i++)
			pow*=base;
		System.out.println(base+" power "+exp+" = "+pow);
	}	
}
