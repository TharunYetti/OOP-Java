//5
import java.util.*;
class SquirrelPlay{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter the temperature:");
		int temp=sc.nextInt();
		System.out.print("ENter true if it is Summer else false:");
		boolean summer=sc.nextBoolean();
		squirrelPlay(temp,summer);
	}
	static void squirrelPlay(int temp,boolean summer){
		if(summer){
			if(temp>=60 && temp<=100) System.out.println("true(Squirrels Play)");
			else System.out.println("false(Squirrels Don't Play)");
		}
		else{
			if(temp>=60 && temp<=90) System.out.println("true(Squirrels Play)");
			else System.out.println("false(Squirrels Don't Play)");
		}
	}
}
