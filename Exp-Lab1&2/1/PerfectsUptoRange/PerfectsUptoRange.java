import java.util.Scanner;
class PerfectsUptoRange{
	int start,end;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter start & end of range(space between):");
		start=read.nextInt();end=read.nextInt();
	}
	void compute(){
		int sum;
		System.out.println("The perfect numbers are ");
		for(int i=start;i<=end;i++){
			sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0)
					sum+=j;
			}
			if(sum==i) System.out.println(i);
		}
	}
}
