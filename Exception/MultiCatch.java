class MultiCatch{
	public static void main(String args[]){
		try{
			int a=args.length;
			System.out.println("Args length="+a);
			int b=40/a;
			System.out.println("Element at 40th position in args is "+args[40]);
		}catch(ArithmeticException ae){
			System.out.println("Arithmetic Exception "+ae);
		}catch(IndexOutOfBoundsException iobe){
			System.out.println("Index Out Of Bounds Exception "+iobe);
		}catch(Exception e){
			System.out.println("Exception caught");
		}
	}
}
