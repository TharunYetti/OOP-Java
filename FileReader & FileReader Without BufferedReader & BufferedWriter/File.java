import java.util.*;
import java.io.*;
class File{
	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("file.txt");
		fw.write(85);
		fw.close();
		FileReader fr=new FileReader("file.txt");
		System.out.println(fr.read());
		fr.close();
	}
}
