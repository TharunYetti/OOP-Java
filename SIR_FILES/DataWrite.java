import java.io.*;
class DataWrite
{
	public static void main(String args[])throws IOException
	{
		                  FileWriter fw=new FileWriter("out.txt");
		                  BufferedWriter bw=new BufferedWriter(fw);
		                  for(int i=0;i<10;i++){
		                  bw.write("Hello World\n");
					  }
		                  bw.close();
		                  fw.close();
		                  
	}
}
