import java.util.*;
import java.io.*;
class RandomNums{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many numbers do you want? ");
		String line=br.readLine();
		int n=Integer.parseInt(line);
		float numbers[]=new float[n];
		Random r=new Random();
		for(int i=0;i<n;i++)
		{
			float element=r.nextFloat(200);
			numbers[i]=element;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(numbers[i]);
		}	
	}
}
