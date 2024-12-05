class OddNums implements Runnable{
	int from,to;
	String name;
	OddNums(String n,int f,int t){
		this.name=n;
		this.from=f;
		this.to=t;
	}
	public void run(){
		for(int i=from;i<to;i++){
			if(i%2==1) System.out.println(name+" Odd:"+i);
		}
	}
	String getTName(){
		return this.name;
	}
}
