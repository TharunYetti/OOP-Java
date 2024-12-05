//28
import java.io.*;
class RmPattern{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string:");
		String str=br.readLine();
		System.out.println(rmPattern(str));
	}
	static String rmPattern(String str){
		String k="";
		int i=0;
		while(i<str.length()){
			k+=str.charAt(i);
			if(str.charAt(i)=='r' && str.charAt(i+2)=='m') i=i+2;
			else i=i+1;
		}
		return k;
	}
}
