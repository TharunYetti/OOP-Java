import java.io.*;
class MergeTwo{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENter the size of array1:");
		int n1=Integer.parseInt(br.readLine());
		System.out.print("ENter the size of array2:");
		int n2=Integer.parseInt(br.readLine());
		String a[]=new String[n1],b[]=new String[n2];
		System.out.println("ENter the characters in first array");
		for(int i=0;i<n1;i++){
			System.out.print("Enter the character "+(i+1)+":");
			a[i]=br.readLine();
		}
		System.out.println("ENter the characters in second array");
		for(int i=0;i<n2;i++){
			System.out.print("Enter the character "+(i+1)+":");
			b[i]=br.readLine();
		}
		System.out.print("Enter how many characters do you want in new array:");
		int n=Integer.parseInt(br.readLine());
		String new_char[]=mergeTwo(a,b,n);
		for(int i=0;i<new_char.length;i++)	System.out.println(new_char[i]);
	}
	static String[] mergeTwo(String a[],String b[],int n){
		String new_char[]=new String[n];
		int i=0,j=0;
		for(i=0;i<(n/2+1) && i<(a.length);i++) new_char[i]=a[i];
		int temp=0;
		for(j=0;j<b.length && (i+temp)<n;j++){
			int ispresent=0;
			for(int k=0;k<i;k++) if(b[j].compareTo(new_char[k])==0) ispresent=1;
			if(ispresent==0) { new_char[i+temp]=b[j]; temp+=1;}
		}
		return new_char;
	}
}
