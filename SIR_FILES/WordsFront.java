import java.io.*;
class WordsFront{
	public static void main(String args[])throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many words do you want? ");
		int size=Integer.parseInt(br.readLine());
		String words[]=new String[size];
		for(int i=0;i<size;i++)
		{
			String word=br.readLine();
			words[i]=word;
		}
		System.out.println("Enter Required Length of words : ");
		int val=Integer.parseInt(br.readLine());
		for(int i=0;i<size;i++){
			System.out.println(words[i].length());
		}
	}
}
