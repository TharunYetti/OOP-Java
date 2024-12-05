import java.util.*;
class Ramanujan{
	int start,end;
	void getInput(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter start & end(space between):");
		start=scan.nextInt();
		end=scan.nextInt();
	}
	void compute(){
		int arePresent=0;
		System.out.println("The Ramanujan(2-way) numbers are ");
		for(int i=start;i<=end;i++){
			int numOfWays=0,n1=0,n2=0;
			for(int j=1;j<=i;j++){
				for(int k=1;k<=i;k++){
					if(Math.pow(j,3)+Math.pow(k,3)==i) numOfWays++;
				}
			}
			if(numOfWays==2*2)
				System.out.println(i);
				arePresent=1;
		}
		if(arePresent==0){
			System.out.println("NO ramanujan(2-way) nums found in given range");
		}
	}
}
