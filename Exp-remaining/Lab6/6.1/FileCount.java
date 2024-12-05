import java.io.*;//for BufferedReader
import java.util.*;//for StringTokenizer
class FileCount{
	public static void main(String args[])throws IOException{
		FileReader fr=new FileReader("input.txt");
		//filereader cant alone reads the data it just creating an object to access tht text file..so we use bufferreader
		BufferedReader br=new BufferedReader(fr);
		//System.out.println(br.readLine());	
		String line=br.readLine();
		String words[]=new String[200];
		int count=0,lines=0,chars=0,digits=0,sp_chars=0,alphas=0;
		while(line!=null){
			StringTokenizer st=new StringTokenizer(line);
			while(st.hasMoreTokens()){
				words[count]=st.nextToken();
				for(int i=0;i<words[count].length();i++){
					if(words[count].charAt(i)>='0' && words[count].charAt(i)<='9')
						digits++;
					else if((words[count].charAt(i)>='A' && words[count].charAt(i)<='Z')||(words[count].charAt(i)>='a' && words[count].charAt(i)<='z'))
						alphas++;
					else
						sp_chars++;
					chars++;
				}
				count++;
			}
			lines++;
			line=br.readLine();
		}
		System.out.println("Total no.of words are "+count);
		System.out.println("Total no.of lines are "+lines);
		System.out.println("Total no.of characters are "+chars);
		System.out.println("Total no.of digits are "+digits);
		System.out.println("Total no.of Special Characters are "+sp_chars);
		br.close();
		fr.close();
	}
}
