import java.util.*;
class ArrayIntialization{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("ENter size of an array:");
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.printf("ENter the arr[%d] element:",i+1);
			arr[i]=scan.nextInt();
			//System.out.print(arr[i]+",");
		}
		System.out.println("Printing the array");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println('\b');
	}
}
