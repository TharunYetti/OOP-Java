//16
import java.io.*;
class WithoutX2{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string:");
		String str=br.readLine();
		System.out.println(withoutX2(str));
	}
	static String withoutX2(String str){
		int len=str.length();
		String newstr="";
		for(int i=0;i<len;i++){
			if( str.charAt(i)=='x' && (i==0 || i==1) )
				continue;
			newstr+=str.charAt(i);
		}
		return newstr;
	}
}
