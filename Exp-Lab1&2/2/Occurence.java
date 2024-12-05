//33
import java.io.*;
class Occurence{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the main string:");
		String str=br.readLine();
		System.out.print("Enter the sub string:");
		String sub=br.readLine();
		System.out.println(occurence(str,sub));
	}
	static int occurence(String str,String sub){
		int count=0;
		for(int i=0;i<str.length();i++){
			int len=0;
			for(int j=0;j<sub.length();j++){
				if(str.charAt(i+j)==str.charAt(j))
					len++;
				else
					break;
			}
			if(len==sub.length())
				count++;
		}
		return count;
	}
}
