import java.io.*;//for BufferedReader
import java.util.*;//for StringTokenizer
class FileRead{
	public static void main(String args[])throws IOException{
		FileReader fr=new FileReader("bones.txt");
		//filereader cant alone reads the data it just creating an object to access tht text file..so we use bufferreader
		BufferedReader br=new BufferedReader(fr);
		//System.out.println(br.readLine());	
		String line=br.readLine();
		String words[]=new String[200];
		int i=0;
		while(line!=null){
			//System.out.println(line);
			StringTokenizer st=new StringTokenizer(line);
			while(st.hasMoreTokens()){
				words[i]=st.nextToken();
				i++;
			}
			line=br.readLine();
		}
		for(int k=0;k<i;k++){
			System.out.println(words[k]);
		}
		System.out.println("TOtal no.of words are "+i);
		
		for(int j=0;j<(i-1);j++){
			for(int l=0;l<(i-1-j);l++){
				if((words[l].compareTo(words[l+1])) >0){
					String temp=words[l];
					words[l]=words[l+1];
					words[l+1]=temp;
				}
			}
		}
		FileWriter fw=new FileWriter("output.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		for(int k=0;k<i;k++){
			//System.out.print(words[k]+"\t");
			bw.write((k+1)+"."+words[k]+"\n");
			for(int t=0;t<words[k].length();t++){
				char c=words[k].charAt(t);
				int z=(int)c;
				System.out.println(c+"--"+z);
			}
		}
		
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}
}
