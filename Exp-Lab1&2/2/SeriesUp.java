//13
import java.util.*;
class SeriesUp{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		seriesUp(n);
	}
	static void seriesUp(int n){
		System.out.print("{");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print(j+",");
		}
		System.out.println("\b}");
		System.out.println("The length of the array is "+(n*(n+1)/2));
	}
	
}
