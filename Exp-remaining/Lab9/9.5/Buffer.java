class Buffer{
	boolean status;
	int ele;
	synchronized public void insert(int e){
		if(status){
			try{
				wait();
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		this.ele=e;
		status=true;
		notify();
	}
	synchronized public int pop(){
		if(!status){
			try{
				wait();
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		status=false;
		notify();
		return this.ele;
	}
}
