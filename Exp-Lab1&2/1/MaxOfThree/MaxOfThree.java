import java.util.Scanner;
class MaxOfThree{
	int n1,n2,n3;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter three Numbers(space between):");
		n1=read.nextInt();n2=read.nextInt();n3=read.nextInt();
	}
	void compute(){	
		max=(n1>=n2 && n1>=n3)?n1:(n2>=n3)?n2:n3;
		System.out.println(max+" is the maximum of given three");
	}
}



