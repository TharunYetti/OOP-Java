//31
import java.io.*;
import java.util.*;
class Sachin{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		sachin(str);
	}
	static void sachin(String str){
		StringTokenizer st=new StringTokenizer(str);
		String arr[]=new String[100];
		int i=0;
		while(st.hasMoreTokens()){
			arr[i]=st.nextToken();
			i++;
		}
		for(int k=0;k<i;k++){
			if(k%2==0){
				System.out.print(arr[k]+" ");
			}
		}
		System.out.println();
	}
}
