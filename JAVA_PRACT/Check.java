class Check{
	static void method()throws ArrayIndexOutOfBoundsException,IllegalAccessException{
		System.out.println("Method executed");
		throw new IllegalAccessException();
	}
	public static void main(String args[])throws IllegalAccessException{
		System.out.println("Before method...");
		try{
		method();
		}catch(IllegalAccessException e){}
		finally{
			System.out.println("After method...");
		}
	}
}
