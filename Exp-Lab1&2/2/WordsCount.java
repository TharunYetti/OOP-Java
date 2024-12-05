//2
import java.util.*;
class WordsCount{
	public static void main(String args[]){
		System.out.println("Enter how many strings do you want:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i;
		String words[]=new String[n];
		for(i=0;i<n;i++){
			System.out.print("Enter String "+(i+1)+":");
			words[i]=sc.next();
		}
		System.out.print("Enter the length of the string to check in the array:");
		int len=sc.nextInt();
		System.out.println(wordsCount(words,n,len));
	}
	static int wordsCount(String[] a,int arraylen,int len){
		int i=0,count=0;
		for(;i<arraylen;i++){
			if(a[i].length()==len)
				count++;
		}
		return count;
	}
}
