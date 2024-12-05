//15
import java.io.*;
class MiddleTwo{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string of even length:");
		String str=br.readLine();
		System.out.println(middleTwo(str));
	}
	static String middleTwo(String str){
		String newstr="";
		if(str.length()%2==0){
			newstr+=str.charAt((str.length()/2)-1);
			newstr+=str.charAt(str.length()/2);
		}
		return newstr;
	}
}
