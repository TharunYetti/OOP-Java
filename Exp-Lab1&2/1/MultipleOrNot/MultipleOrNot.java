import java.util.Scanner;
class MultipleOrNot{
	int n1,n2;
	void getInput(){
		Scanner obj=new Scanner(System.in);
		System.out.print("ENter two numbers:");
		n1=obj.nextInt();n2=obj.nextInt();
	}
	void compute(){	
		if(n1%n2==0)
			System.out.println(n1+" is the mutiple of "+n2);
		else if(n2%n1==0)
			System.out.println(n2+" is the mutiple of "+n1);
		else
			System.out.println("One is not the mutiple of another");
	}
}
