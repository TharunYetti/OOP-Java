//27
import java.io.*;
class ZeroFront{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of first array:");
		int n1=Integer.parseInt(br.readLine());
		int a[]=new int[n1];
		for(int i=0;i<n1;i++){
			System.out.print("Enter the element "+(i+1) +":");
			a[i]=Integer.parseInt(br.readLine());
		}
		int arr[]=zeroFront(a);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	static int[] zeroFront(int a[]){
		for(int i=0;i<(a.length-1);i++){
			for(int j=0;j<(a.length-1-i);j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
}
