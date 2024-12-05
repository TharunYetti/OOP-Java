class EvenGen extends Thread{
	Buffer b;
	int n;
	EvenGen(Buffer b,int n){
		this.b=b;
		this.n=n;
	}
	public void run(){
		for(int i=2;i<=n;i++){
			if(i%2==0){
				b.insert(i);
			}
		}
	}
}
