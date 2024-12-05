import java.util.*;
class OPSDemo{
	public static void main(String args[]){
		StudentBuffer sb=new StudentBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of students:");
		int n=sc.nextInt();
		ASWO a1=new ASWO(sb,n);
		HOD h1=new HOD(sb,n);
		a1.start();
		h1.start();
	}
}
