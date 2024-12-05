import java.util.Scanner;
import java.lang.Math;
class ArmstrongsUptoRange{
	int start,end;
	void getInput(){
		Scanner scan=new Scanner(System.in);
		System.out.print("ENter the start number in the range:");
		start=scan.nextInt();
		System.out.print("ENter the end number in the range:");
		end=scan.nextInt();
	}
	void compute(){
		System.out.println("The armstrong numbers are ");
		for(int i=start;i<=end;i++){
			int c=0,dig,len=0,temp=i,temp2=i;
			double t,sum=0;
			while(temp!=0){
				c=c+1; temp/=10;
			}
			while(temp2!=0){
				dig=temp2%10; t=Math.pow(dig,c);
				sum=sum+t; temp2/=10;
			}
			if(sum==i) System.out.println(i);
		}
	}
}
