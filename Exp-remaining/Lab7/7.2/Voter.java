import java.io.*;
class Voter{
	String name;
	int age;
	Voter(String n,int a){
		this.name=n;
		this.age=a;
	}
	void outData()throws IOException,AgeException{
		FileWriter fw=new FileWriter("Voters.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		try{
			if(age<18){
				throw new AgeException(age);
			}
			else{
				bw.write(name+" "+age+"\n");
			}
		}catch(AgeException ae){
			System.out.println(ae);
		}finally{
			bw.close();
			fw.close();
		}
	}
}
