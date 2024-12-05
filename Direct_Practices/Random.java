import java.lang.*;
import java.util.*;
import java.io.*;
class Random{
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
/*
import java.util.Random;
import java.io.*;
class Random{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter how many numbers do you want:");
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		Random R=new Random();
		for(int i=0;i<n;i++){
			int k=R.nextInt(100);
			arr[i]=k;
		}
		for(int i=0;i<n;i++) System.out.println(arr[i]);
	}
}
*/
