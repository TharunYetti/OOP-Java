//20
import java.io.*;
class CountTriple{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string:");
		String str=br.readLine();
		System.out.println(countTriple(str));
	}
	static int countTriple(String str){
		int n=str.length(),sum=0;
		for(int i=0;i<(n-3);i++){
			int count=0;
			char c=str.charAt(i);
			for(int j=i;j<(i+3);j++){
				if(str.charAt(j)==c) count++;
			}
			if(count==3) sum++;
		}
		return sum;
	}
}
