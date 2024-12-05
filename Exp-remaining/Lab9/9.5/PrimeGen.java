class PrimeGen extends Thread{
	Buffer b;
	int n;
	PrimeGen(Buffer b,int n){
		this.b=b;
		this.n=n;
	}
	public void run(){
		for(int i=2;i<=n;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0) count++;
			}
			if(count==2) b.insert(i);
		}
	}
}
