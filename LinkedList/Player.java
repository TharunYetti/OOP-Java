class Player{
	String name;
	int age,jNo;
	double rem;
	Player next;
	Player(String n,int age,int j,double r){
		this.name=n;
		this.age=age;
		this.jNo=j;
		this.rem=r;
		this.next=null;
	}
	public String toString(){
		return "Name:"+name+"\tAge:"+age+"\tJersey no:"+jNo+"\tRemuneration:"+rem;
	}
}
