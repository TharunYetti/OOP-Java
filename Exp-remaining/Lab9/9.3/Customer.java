class Customer{
	String name,mailId;
	int age;
	boolean status;
	synchronized void add(String name,int a,String mail){
		if(status){
			try{
				wait();
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		this.name=name;
		this.age=a;
		this.mailId=mail;
		status=true;
		notify();
	}
	synchronized String read(){
		if(!status){
			try{
				wait();
			}catch(InterruptedException ie){
				System.out.println(ie);
			}
		}
		status=false;
		notify();
		return name+" "+age+" "+mailId;
	}
}
