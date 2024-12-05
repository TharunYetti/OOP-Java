//19
import java.io.*;
public class StarOut{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		System.out.println(starOut(str));
	}
	static String starOut(String str){
		String temp_str="";
		for(int i=0;i<str.length();i++){
			if(i==0){
				if(str.charAt(i)=='*'||str.charAt(i+1)=='*') continue;
				temp_str+=str.charAt(i);
			}
			else if(i==str.length()-1){
				if(str.charAt(i)=='*'||str.charAt(i-1)=='*') continue;
				temp_str+=str.charAt(i);
			}
			else{
				if(str.charAt(i+1)=='*' || str.charAt(i)=='*' || str.charAt(i-1)=='*' ) continue;
				temp_str+=str.charAt(i);
			}
		}
		return temp_str;
	}
}
