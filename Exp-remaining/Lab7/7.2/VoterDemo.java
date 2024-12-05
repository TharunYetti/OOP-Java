import java.io.*;
class VoterDemo{
	public static void main(String args[])throws IOException,AgeException{
		Voter v1=new Voter("Satya",13);
		v1.outData();
		Voter v2=new Voter("Ram",23);
		v2.outData();
		Voter v3=new Voter("Nandha",12);
		v3.outData();
		Voter v4=new Voter("Tharun",19);
		v4.outData();
	}
}
