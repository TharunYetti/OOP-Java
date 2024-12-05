import java.util.*;
class PowerFunction{
	public static void main(String args[]){
		System.out.print("Enter base and exp(exp must be int) to find the power:");
		Scanner scan=new Scanner(System.in);
		float base=scan.nextFloat();
		int exp=scan.nextInt();
		float pow=1.0f;
		for(int i=1;i<=exp;i++){
			pow=pow*base;
		}
		System.out.println("Power is "+pow);
	}
	
}
