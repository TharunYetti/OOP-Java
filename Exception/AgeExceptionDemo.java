import java.util.*;
class AgeExceptionDemo{
	static void votingCheck(int age)throws AgeException{
		if(age<18) throw new AgeException(age);
		else System.out.println("ELigible");
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=scan.nextInt();
		try{
			votingCheck(age);
		}catch(AgeException ae){
			System.out.println("ArithmeticException Recaught:"+ae);
		}
	}
}
