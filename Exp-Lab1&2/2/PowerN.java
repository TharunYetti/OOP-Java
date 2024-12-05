//9
import java.util.*;
class PowerN{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter the base and power(non negative) with a space between:");
		int b=sc.nextInt(),p=sc.nextInt();
		System.out.println(powerN(b,p));
	}
	static int powerN(int base,int power){
		if(power!=1){
			return base*powerN(base,power-1);
		}
		return base;
	}
}
