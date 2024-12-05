import java.util.Scanner;
import java.io.*;
class ascii_value_of_char{
	public static void main(String args[])throws IOException{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a character");
		char chr=read.next().charAt(0);
		System.out.println("The ascii value of "+chr+" is "+(int)chr);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number:");
		String s=br.readLine();
		int n=Integer.parseInt(s);
		System.out.println("Entered number is ",n);
	}
}



