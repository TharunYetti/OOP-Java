//18
import java.io.*;
class RepeatFront{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string:");
		String str=br.readLine();
		System.out.print("Enter the number of chaacters you want to repeat:");
		String str_n=br.readLine();
		int n=Integer.parseInt(str_n);
		System.out.println(repeatFront(str,n));
	}
	static String repeatFront(String str,int n){
		String newstr="";
		if(n>=0 && n<=str.length()){
			for(int i=1;i<=n;i++){
				for(int j=0;j<=(n-i);j++){
					newstr+=str.charAt(j);
				}
			}
			return newstr;
		}
		return newstr;
	}
}
