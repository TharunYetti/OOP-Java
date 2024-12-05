//23
import java.util.*;
class MakeMiddle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array(even):");
		int n=sc.nextInt();
		if(n%2!=0)
			return;
		int arr[]=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++){
			System.out.print("Enter element "+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		int new_arr[]=makeMiddle(arr);
		for(int i=0;i<new_arr.length;i++)//array.length method is used to find length of an array-----arr.length!=arr.length()
			System.out.println(new_arr[i]);
	}
	static int[] makeMiddle(int arr[]){
		int new_arr[]=new int[2];
		if(arr.length%2==0){
			new_arr[0]=arr[(arr.length/2)-1];
			new_arr[1]=arr[(arr.length/2)];
		}
		return new_arr;
	}
}
