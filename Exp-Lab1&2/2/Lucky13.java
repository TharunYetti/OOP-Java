//25
import java.io.*;
class Lucky13{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of first array:");
		int n1=Integer.parseInt(br.readLine());
		int a[]=new int[n1];
		for(int i=0;i<n1;i++){
			System.out.print("Enter the element "+(i+1) +":");
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(lucky13(a));
	}
	static boolean lucky13(int a[]){
		for(int i=0;i<a.length;i++){
			if(a[i]==1 || a[i]==3)
				return false;
		}
		return true;
	}
}
