import java.util.*;//for BufferedReader
import java.io.*;//for StringTokenizer
class FileEncryptTo{
	public static void main(String args[])throws IOException{
		FileReader fr=new FileReader("input.txt");
		FileWriter fw=new FileWriter("encrypt.txt");
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String line=br.readLine(),words[]=new String[2000];
		int count=0,key=4;
		while(line!=null){
			String temp="";
			for(int i=0;i<line.length();i++){
				if(line.charAt(i)>='A' && line.charAt(i)<='Z'){
					int asc=line.charAt(i)+key;
					if(asc>90){
						asc=asc-26;
						temp+=(char)asc;
					}
					else
						temp+=(char)asc;
				}
				
				else if(line.charAt(i)>='a' && line.charAt(i)<='z'){
					int asc=line.charAt(i)+key;
					if(asc>122){
						asc=asc-26;
						temp+=(char)asc;
					}
					else
						temp+=(char)asc;
				}
				else
					temp+=line.charAt(i);
			}
			System.out.println(temp);
			bw.write(temp+"\n");
			line=br.readLine();
		}
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}
