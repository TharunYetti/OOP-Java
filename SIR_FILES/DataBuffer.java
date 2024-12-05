import java.io.*;
class DataBuffer{
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		              System.out.println("Enter a Value: ");
		              String s=br.readLine();
		              String sub=s.substring(0);
		              System.out.println(sub);
		              String s1="RGUKT";
		              String s2=s1;
		              if(s1==s2)
						System.out.println("Same Ref...");
					else
						System.out.println("Diff Ref");
		              System.out.println(s);
		               String rev="";
		              int n=s.length();
		              for(int i=n-1;i>=0;i--){
						  //System.out.println(s.charAt(i));
						  rev = rev+s.charAt(i);	  
					  }
					  if(s.equals(rev))
						System.out.println(rev +" is palindrome");
					else System.out.println(rev +" is not palindrome");
					  
		              
	}
}
