import java.io.*;
class UseBuffer{
	public static void main(String args[])throws IOException
	{
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    
		    String s1=br.readLine();
		    int len=s1.length();
		    String s2="";
		    for(int i=len-1;i>=0;i--){
				s2=s2+s1.charAt(i);
				//System.out.println(s1.charAt(i));
			}
			System.out.println("Reverse: "+s2);
			if(s1.equals(s2))
				System.out.println("Palindrome...");
			else System.out.println("Not Palindrome");
	}
}
