//usage of throw keyword
import java.util.*;
class ThrowDemo{
	static void votingCheck(int age){
		/*
		try{
			if(age<18){
				throw new ArithmeticException();
			}
			else{
				System.out.println("ELigible");
			}
		}catch(ArithmeticException ae){
			//System.out.println(ae);
			throw ae;
		}
		*/
		if(age<18) throw new ArithmeticException();
		else System.out.println("ELigible");
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=scan.nextInt();
		try{
			votingCheck(age);
		}catch(ArithmeticException ae){
			System.out.println("ArithmeticException Recaught:"+ae);
		}
	}
}
