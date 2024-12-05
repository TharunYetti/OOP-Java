//14
import java.io.*;
class HelloName{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name:");
		String name=br.readLine();
		System.out.println(helloName(name));
	}
	static String helloName(String name){
		return ("Hello "+name+"!");
	}
}
