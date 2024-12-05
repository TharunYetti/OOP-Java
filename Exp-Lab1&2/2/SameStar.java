//30
import java.io.*;
class SameStar{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string:");
		String str=br.readLine();
		System.out.println(sameStar(str));
	}
	static boolean sameStar(String str){
		for(int i=1;i<str.length()-1;i++){
			if( (str.charAt(i)=='*')||(str.charAt(i-1)==str.charAt(i+1)))
				return true;
		}
		return false;
	}
}
