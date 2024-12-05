//7
import java.util.*;
class EvenlySpaced{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three numbers with a space between:");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		System.out.println(evenlySpaced(a,b,c));
	}
	static boolean evenlySpaced(int a,int b,int c){
		if((a-b)==(b-c) || (a-b)==(c-b) || (b-a)==(b-c) || (b-a)==(c-b) ){
			return true;
		}
		return false;
	}
}
