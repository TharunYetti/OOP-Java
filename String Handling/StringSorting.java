import java.util.*;
import java.io.*;
class StringSorting{
	public static void main(String args[])throws IOException{
		System.out.print("Enter the size of the array:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		int n=Integer.parseInt(line);
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.printf("Enter a string at arr[%d]:",i);
			String text=br.readLine();
			arr[i]=text;
		}
		StringSorting obj=new StringSorting(); 
		obj.printArray(arr,n);
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if( ( arr[j].compareTo(arr[j+1] )>0)){
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("String array is Sorted!!!!!!!!!!!!!!");
		obj.printArray(arr,n);
	}
	void printArray(String arr[],int n){
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}
