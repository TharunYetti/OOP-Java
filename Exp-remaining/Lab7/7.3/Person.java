import java.io.*;
class Person{
	String name;
	int age;
	Person(String n,int a){
		this.name=n;
		this.age=a;
	}
	void outData()throws IOException{
		FileWriter fw=new FileWriter("Numerics.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		int flag=0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)>=48 && name.charAt(i)<=57) flag++;//or we can use parseInt method
		}
		try{
			if(flag!=0){
				throw new NumericException(age);
			}
			else{
				bw.write(name+" "+age+"\n");
			}
		}catch(NumericException ne){
			System.out.println(ne);
		}finally{
			bw.close();
			fw.close();
		}
	}
}
