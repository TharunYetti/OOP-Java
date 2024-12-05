//3
import java.util.*;
class WordsFront{
	public static void main(String args[]){
		System.out.println("Enter how many strings do you want to enter:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i;
		String words[]=new String[n];
		for(i=0;i<n;i++){
			System.out.print("Enter String "+(i+1)+":");
			words[i]=sc.next();
		}
		System.out.print("Enter the how many strings from front do you want:");
		int N=sc.nextInt();
		wordsCount(words,n,N);
	}
	static void wordsCount(String[] a,int arraylen,int N){
		int i=0;
		System.out.print("{");
		for(;i<arraylen && i<N;i++)
			System.out.print("\""+a[i]+"\",");
		System.out.println("}");
	}
}
