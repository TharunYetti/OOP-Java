//29
import java.io.*;
class ParentBit{
	String rstr="";
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string:");
		String str=br.readLine();
		System.out.println(parentBit(str));	
	}
	/*
	static String parentBit(String str){
		String k="";
		int i=0,isPresent=0;
		while(i<str.length()){
			if(str.charAt(i)=='(')
				isPresent=i;
			i++;
		}
		i=isPresent;
		do{
			k+=str.charAt(i);
			i++;
		}while(str.charAt(i)!=')');
		k+=')';
		return k;
	}
	*/
	static String parentBit(String str){
		if(str.charAt(0)=='('){
			return str.substring(0,(str.indexOf(')')+1));
		}
		else{
			return parentBit(str.substring(1));
		}
	}
}
