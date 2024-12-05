import java.util.Scanner;
class ArrayOfObjects{
	public static void main(String args[]){
		Student arr[]=new Student[3];
		for(int i=0;i<3;i++){
			System.out.println("Enter the student name and roll number");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			int roll=sc.nextInt();
			arr[i]=new Student(name,roll);
		}
		for(int i=1;i<=3;i++){
			System.out.println(arr[i-1]);
		}
	}
}
