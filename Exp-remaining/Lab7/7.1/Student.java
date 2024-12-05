import java.io.*;
class Student{
	String name;
	int age;
	double percentage;
	Student(String n,int a,double p){
		this.name=n;
		this.age=a;
		this.percentage=p;
	}
	void outData()throws IOException{
		FileWriter fw=new FileWriter("out.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		try{
			if(percentage<50){
				throw new PercentageException(percentage);
			}
			else{
				bw.write(name+" "+age+" "+percentage+"\n");
			}
		}catch(PercentageException pe){
			System.out.println(pe);
		}finally{
			bw.close();
			fw.close();
		}
	}
}
