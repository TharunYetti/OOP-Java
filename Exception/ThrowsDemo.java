class ThrowsDemo{
	static void m1()throws NullPointerException{
		try{
			throw new NullPointerException();
		}finally{
			System.out.println("Finally in m1");
		}
	}
	public static void main(String args[]){
		try{
			m1();
		}catch(NullPointerException n){
			System.out.println(n);
		}
	}
}
