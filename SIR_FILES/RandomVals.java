import java.util.*;
import java.io.*;
class RandomVals{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers do you want? ");
		String s=br.readLine();
		int n=Integer.parseInt(s);
		float numbers[]=new float[n];
		Random rand=new Random();
		for(int i=0;i<n;i++)
		{
			  numbers[i]= rand.nextFloat(100,500);
		}
		for(int i=0;i<n;i++){
			System.out.println(numbers[i]);
		}
		
	}
}
