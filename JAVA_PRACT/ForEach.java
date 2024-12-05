class ForEach{
	/*
	static should not be used in instance methods
	void print(){
		static a=20;
		System.out.println(a);
	}
	*/
	public static void main(String args[]){
		int a=23;
		int[] arr=new int[]{2,3,4,5};
		for(int i:arr){
			System.out.println(i);
		}
		//print();
		System.gc();
	}
}
