import java.io.*;
class StudentDemo{
	public static void main(String args[])throws IOException,PercentageException{
		Student s1=new Student("Satya",35,40);
		s1.outData();
		Student s2=new Student("Nanda",45,56);
		s2.outData();
		Student s3=new Student("Ram",45,93);
		s3.outData();
	}
}
