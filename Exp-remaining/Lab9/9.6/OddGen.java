class OddGen extends Thread{
	Buffer b;
	int n;
	OddGen(Buffer b,int n){
		this.b=b;
		this.n=n;
	}
	public void run(){
		for(int i=1;i<=n;i++){
			if(i%2==1){
				b.insert(i);
			}
		}
	}
}
