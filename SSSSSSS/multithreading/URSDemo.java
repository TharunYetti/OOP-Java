import java.util.*;
class URSDemo{
	public static void main(String args[]){
		StudentBuffer sb=new StudentBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Count of Registrations: ");
		int n=sc.nextInt();
		Registrar r1=new Registrar(sb,n);
		Validator v1=new Validator(sb,n);
		r1.start();
		v1.start();
		sc.close();
	}
}