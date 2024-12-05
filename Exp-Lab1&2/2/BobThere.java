//17
import java.io.*;
class BobThere{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string:");
		String str=br.readLine();
		System.out.println(bobThere(str));
	}
	static boolean bobThere(String str){
		int len=str.length();
		for(int i=0;i<len;i++){
			if(str.charAt(i)=='b' && (str.charAt(i)==str.charAt(i+2)) )
				return true;
		}
		return false;
	}
}
