import java.util.*;
class Sorting{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size of an array:");
		int size=scan.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.printf("ENter the arr[%d] element:",i+1);
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<(size-1);i++){
			for(int j=0;j<(size-1-i);j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+",");
		}
	}
}
/*
void printArray(int arr[],int size){
	for(int i=0;i<size;i++){
		System.out.printf(arr[i]);
	}
}
*/
