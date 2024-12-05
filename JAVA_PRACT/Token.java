import java.util.*;
class Token{
	public static void main(String args[]){
		StringTokenizer st=new StringTokenizer("Hello I am Tharun Yettis","hit");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
