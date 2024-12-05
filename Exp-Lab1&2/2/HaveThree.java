//26
import java.io.*;
class HaveThree{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of first array:");
		int n1=Integer.parseInt(br.readLine());
		int a[]=new int[n1];
		for(int i=0;i<n1;i++){
			System.out.print("Enter the element "+(i+1) +":");
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(haveThree(a));
	}
	static boolean haveThree(int a[]){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==3)
				count++;
		}
		if(count==3)
			return true;
		else
			return false;
	}
}
