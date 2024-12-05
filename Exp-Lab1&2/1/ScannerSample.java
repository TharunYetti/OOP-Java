import java.util.Scanner;
class ScannerSample{
	public static void main(String args[]){
		System.out.print("ENter your name:");
		Scanner obj=new Scanner(System.in);
		String name=obj.nextLine();
		System.out.println("Hello "+name+"!");
	}
}
