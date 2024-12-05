//6
import java.util.*;
class InOrderEqual{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers with a space between:");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		System.out.print("Enter true if it contains same numbers else false:");
		boolean areSame=sc.nextBoolean();
		System.out.println(inOrderEqual(a,b,c,areSame));
	}
	static boolean inOrderEqual(int b,int c,boolean areSame){
		boolean bool=(a<=b && b<=c)?true:false;
		return bool;
	}
}
