import java.util.Scanner;
class PerfectSquares{
	int start,end;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the start and end of range to print perfect squaress(space between):");
		start=read.nextInt();end=read.nextInt();
	}
	void compute(){
		System.out.println("The perfect squares are ");
		for(int i=start;i<=end;i++){
			for(int j=1;j<=i;j++){
				if(j*j==i){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
