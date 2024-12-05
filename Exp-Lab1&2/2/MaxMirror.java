//12
import java.util.*;
class MaxMirror{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		System.out.println("Length of the array of Mirror:"+maxMirror(array,n));
	}
	static int maxMirror(int array[],int n){
		int count=0;
		for(int i=0;i<n;i++){
			int k=1;count=0;
			for(int j=i;j<(n+i)/2;j++){
				if(array[j]==array[n-k]){
					count++;
					k++;
				}
				else break;
			}
			if(count!=0)
				return count;
		}
		return count;
	}
}



