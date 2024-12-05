//using bufferReader
import java.util.*;
import java.io.*;
class bReader{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*String s=br.readLine();
		int n=Integer.parseInt(s);*/
		System.out.println("Enter a string");
		String s1=br.readLine();
		//int n=Integer.parseInt(s1);
		System.out.println(s1.length());
		//to access each character
		for(int i=0;i<(s1.length());i++){
			System.out.println(s1.charAt(i));
		}
		//String plaindorme
		System.out.println("Enter a string to check whether it is plaindrome or not");
		String str=br.readLine();
		int len=str.length(),isorder=0;
		for(int i=0;i<(len)/2;i++){
			isorder=0;
			if(str.charAt(i)==str.charAt(len-1-i))
				isorder=1;
			if(isorder==0)
				break;
		}
		if(isorder==1)
			System.out.println("Plaindrome");
		else
			System.out.println("Not Plaindrome");
		//method 2 to check palindrome
		System.out.println("Enter a string to check whether it is plaindrome or not");
		String str1=br.readLine(),str2="";
		int len2=str1.length();
		for(int i=0;i<len2;i++){
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		if(str1.equals(str2))
			System.out.println("Plaindrome");
		else
			System.out.println("Not Plaindrome");
		
	}
}
