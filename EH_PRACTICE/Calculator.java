import java.util.*;
class Calculator{
	static double num1=0;
	static double num2=0;
	public static void main(String args[]){
		double val=0;
		String choice=null;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.print("Enter first number:");
			num1=scan.nextDouble();
			System.out.print("Enter second number:");
			num2=scan.nextDouble();
			System.out.print("List of operations\n\ta-for addition\n\ts-for subraction\n\tm-for multiplication\n\td-for division\n\tmod - for modulus\nENter your choice:");
			char ch=scan.next().charAt(0);
			switch(ch){
				case 'a':val=add(num1,num2);break;
				case 's':val=sub(num1,num2);break;
				case 'm':val=mult(num1,num2);break;
				case 'd':val=div(num1,num2);break;
				//case "mod":val=mod(num1,num2);break;
				default:System.out.println("Babye");
			}
			if(character.compare(ch,'a')==0)
				System.out.println("Okkkkkkkkkkkkkkkkkk");
			System.out.println("The values of your operation is "+val);
			System.out.print("ENter y to continue or n to exit:");
			choice=scan.next();
		}while(choice.equals("y"));
	}
	static double add(double n1,double n2){
		return n1+n2;
	}
	static double sub(double n1,double n2){
		return n1-n2;
	}
	static double mult(double n1,double n2){
		return n1*n2;
	}
	static double div(double n1,double n2){
		return n1/n2;
	}
	static double mod(double n1,double n2){
		return n1%n2;
	}
}
