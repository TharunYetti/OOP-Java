//8
import java.io.*;
public class StrDist{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the main String:");
		String str=br.readLine();
		System.out.print("Enter the sub String:");
		String sub=br.readLine();		
		System.out.println(strDist(str,sub));
	}
	static int strDist(String str,String sub){
		int start=str.indexOf(sub);
		if(start!=-1){
			int end=str.indexOf(sub,(start+sub.length()));
			if(end!=-1){
				return end+sub.length()-start;
			}
			else{
				return sub.length();
			}
		}
		else{
			return -1;
		}
	}
}
		/*
	static int strDist(String str,String sub){
		int start=-1,end=-1,count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==sub.charAt(0)){
				count=0;
				for(int j=0;j<sub.length() && (i+j)<str.length();j++){
					if(str.charAt(i+j)==sub.charAt(j))
						count++;
				}
				if(count==sub.length() && start==-1){
					start=i;
				}
				else if(count==sub.length() && start!=-1){
					end=i+count-1;
				}
				else
					continue;
			}
		}
		if(start!=-1 && end!=-1)
			return end-start+1;
		else if(start!=-1 && end==-1)
			return sub.length();
		else
			return 0;
	}
	*/
	/*
	static int strDist(String str,String sub){
		if(str.indexOf(sub)!=-1 && str.indexOf(sub, (str.indexOf(sub)+sub.length()) )!=-1){
			return str.indexOf(sub,(str.indexOf(sub)+sub.length()))+sub.length()-str.indexOf(sub);
		}
		else if(str.indexOf(sub)!=-1 && str.indexOf(sub, (str.indexOf(sub)+sub.length()) )==-1){
			return str.indexOf(sub);
		}
		else{
			return -1;
		}
	}
	*/
