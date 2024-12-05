//11
import java.io.*;
class CountPairs{
	static int count=0,counter=0;
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ENter the string:");
		String str=br.readLine();
		System.out.println(countPairs(str));
	}
	static int countPairs(String str){
		if(counter!=str.length() && (counter+2)<str.length()){
			if(str.charAt(counter)==str.charAt((counter++)+2))
				count++;
			return countPairs(str);
		}
		else
			return count;
	}
	/*
	static int countPairs(String str){
		if(str.length()>2){
			if(str.charAt(0)==str.charAt(2))
				count++;
			return countPairs(str.substring(1));
		}
		else
			return count;
	}
	*/
}
