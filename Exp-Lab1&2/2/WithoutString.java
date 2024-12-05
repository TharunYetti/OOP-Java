//21
import java.io.*;
class WithoutString{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the main string:");
		String s1=br.readLine();
		System.out.print("Enter the sub string:");
		String s2=br.readLine();
		if(s2.length()>s1.length())
			return;
		System.out.println(withoutString(s1,s2));
	}
	static String withoutString(String str1,String str2){
		String temp="";
		int i=0;
		while(i<str1.length()){
			int count=0;
			if(str1.charAt(i)==str2.charAt(0)){
				for(int k=0;k<str2.length();k++){
					if(str1.charAt(i+k)==str2.charAt(k)){
						count++;
					}
				}
			}
			if(count==str2.length()) i+=count;
			else{
				temp+=str1.charAt(i);
				i++;
			}
				
		}
		return temp;
	}
}







