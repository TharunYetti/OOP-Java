//24
import java.io.*;
class Front11{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of first array:");
		int n1=Integer.parseInt(br.readLine());
		System.out.print("Enter the size of second array:");
		int n2=Integer.parseInt(br.readLine());
		int a[]=new int[n1],b[]=new int [n2];
		for(int i=0;i<n1;i++){
			System.out.print("Enter the element of first array:");
			a[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n2;i++){
			System.out.print("Enter the element of second array:");
			b[i]=Integer.parseInt(br.readLine());
		}
		int new_arr[]=front11(a,b);
		for(int i=0;i<new_arr.length;i++){
			System.out.println(new_arr[i]);
		}
	}
	static int[] front11(int a[],int b[]){
		int temp[]=new int[2];
		temp[0]=a[0];
		temp[1]=b[0];
		return temp;
	}
}
