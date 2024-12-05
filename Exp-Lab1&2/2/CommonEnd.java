//22
import java.util.*;
class CommonEnd{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of first array and second array with a space btw:");
		int n1=sc.nextInt(),n2=sc.nextInt();
		int a1[]=new int[n1],a2[]=new int[n2];
		System.out.println("Enter elements of first array");
		for(int i=0;i<n1;i++){
			System.out.print("Enter element "+(i+1)+":");
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of second array");
		for(int i=0;i<n2;i++){
			System.out.print("Enter element "+(i+1)+":");
			a2[i]=sc.nextInt();
		}
		System.out.println(commonEnd(a1,a2));
	}
	static boolean commonEnd(int a1[],int a2[]){
		if( (a1[0]==a2[0])||(a1[a1.length-1]==a2[a2.length-1]))
			return true;
		return false;
	}
}







