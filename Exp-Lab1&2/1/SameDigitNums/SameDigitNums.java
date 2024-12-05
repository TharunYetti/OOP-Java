import java.util.Scanner;
class SameDigitNums{
	int start,end;
	void getInput(){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter start(>=10) & end of range(space between)");
		start=read.nextInt();end=read.nextInt();
	}
	void compute(){
		int dig;
		System.out.println("The same digit numbers are ");
		for(int i=start;i<=end;i++){
			int key=(i%10),temp=i,issame=0;
			while(temp!=0){
				issame=0;
				dig=temp%10;
				if(dig==key) issame=1;
				if(issame==0) break;
				temp/=10;
			}
			if(issame==1) System.out.println(i);
		}
	}
}







