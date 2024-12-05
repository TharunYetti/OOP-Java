import java.util.*;
class Except{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		try{
			int c=a/b;
			System.out.println("output="+c);
			int arr[]={20,30,40,50};
			System.out.println(arr[c]);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException a1){
			System.out.println("Array index --> "+a1);
		}
		finally{
			System.out.println("Finaly block....");//finally block will exceute whether the exception is encountered or not
		}
		System.out.println("Outside of exceptpon.........normal flow");
	}
}
