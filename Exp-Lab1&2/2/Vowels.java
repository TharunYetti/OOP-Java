//32
import java.io.*;
import java.util.*;
class Vowels{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		vowels(str);
	}
	static void vowels(String str){
		int count=0;
		String new_str="";
		System.out.print("The vowels in given string are ");
		for(int i=0;i<str.length();i++){
			char v=str.charAt(i);
			if(v=='a'||v=='e'||v=='I'||v=='o'||v=='u'){
				System.out.print(str.charAt(i)+",");
				count++;
				if(v=='a')
					new_str+='b';
				else if(v=='e')
					new_str+='f';
				else if(v=='I')
					new_str+='j';
				else if(v=='o')
					new_str+='p';
				else
					new_str+='v';
			}
			else
				new_str+=v;
			
		}
		System.out.println("\b\nNumber of vowels are "+count);
		System.out.println(new_str);
	}
}
