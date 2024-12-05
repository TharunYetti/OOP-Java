import java.io.*;
class Files{
	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("out.txt");
		fw.write("Ker");
		fw.close();
		char[] b=new char[3];
		FileReader fr=new FileReader("out.txt");
		fr.read(b);
		for(int i:b){
			System.out.println((char)i);
		}
		fr.close();		
		FileWriter fw1=new FileWriter("out.txt");
		BufferedWriter bw=new BufferedWriter(fw1);
		bw.write("Hello");
		bw.close();
		fw1.close();
	}
}
