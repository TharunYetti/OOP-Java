//10
import java.util.*;
class BunnyEars{
	static int sum=0;
	public static void main(String args[]){
		System.out.print("Enter the ocunt of bunnies:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(bunnyEars(num));
	}
	static int bunnyEars(int num){
		if(num==0)
			return sum;
		if(num%2==0)
			return sum+3+bunnyEars(num-1);
		else
			return sum+2+bunnyEars(num-1);
	}
	
}











