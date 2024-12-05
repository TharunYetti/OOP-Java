import java.io.*;
import java.util.*;
class DataWrite{
	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("output.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=1;i<=10;i++){
			bw.write("Hello World!\n");
		}
		
		bw.close();
		fw.close();
	}
}
