import java.util.Scanner;
class PrimesUptoRange{
	int start,end;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.print("Enter start & end of range(space between):");
		start=read.nextInt();end=read.nextInt();
	}
	void compute(){
		int count;
		System.out.println("The primes numbers are ");
		for(int i=start;i<=end;i++){
			count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0) count++;
			}
			if(count==2) System.out.println(i);
		}
	}
}
