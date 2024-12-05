import java.util.*;
class PrintNumsUptoRange{
	int start,end;
	void getInput(){
		Scanner scan=new Scanner(System.in);
		System.out.print("ENter the start and end of the range to print numbers(space between):");
		start=scan.nextInt();
		end=scan.nextInt();
	}
	void compute(){
		System.out.println("Numbers in the given range are ");
		for(int i=start;i<=end;i++)
			System.out.println(i);
	}
}
