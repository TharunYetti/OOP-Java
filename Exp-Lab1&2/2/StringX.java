//1
import java.io.*;
class StringX{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		System.out.print("Enter the string:");
		String str=br.readLine();
		System.out.println(stringX(str));
	}
	static String stringX(String a){
		String newstr="";
		int len=a.length(),count=0;
		for(int i=0;i<len;i++){
			if(i==0 || i==len-1 || a.charAt(i)!='x'){
				newstr+=a.charAt(i);
				count++;
			}
		}
		return newstr;
	}
}
