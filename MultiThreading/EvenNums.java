class EvenNums implements Runnable{
	int from,to;
	String name;
	EvenNums(String n,int f,int t){
		this.from=f;
		this.to=t;
		this.name=n;
	}
	public void run(){
		for(int i=from;i<to;i++){
			if(i%2==0) System.out.println(name+" Even:"+i);
		}
	}
}
