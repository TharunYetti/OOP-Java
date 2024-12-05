class Subscriber{
	String subId,subName;
	int balance;
	Subscriber next;
	Subscriber(String sid,String sname,int bal){
		this.subId=sid;
		this.subName=sname;
		this.balance=bal;
		this.next=null;
	}
	public String toString(){
		return subId+" "+subName+" "+balance;
	}
}
