import java.util.*;
class NumberCheck{
	static void checkNum(int num){
		int count=0;
		for(int i=1;i<=num;i++) if(num%i==0) count++;
		try{
			if(count==2){
				System.out.println(num+" is a non-prime number");
			}
			else{
				throw new PrimeException(num);
			}
		}catch(PrimeException pe){
			//System.out.println(pe);
			throw pe;
		}
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=scan.nextInt();
		try{
			checkNum(n);
		}catch(PrimeException pe){
			System.out.println(pe);
		}
	}
}
