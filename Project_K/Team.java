class Team{
	String name;
	int wins;
	double netRunRate;
	Team next;
	Team(String n,int w,double d){
		this.name=n;
		this.wins=w;
		this.netRunRate=d;
		this.next=null;
	}
	public String toString(){
		return "\t\t\t\t\t\t>>> "+name+"\t\tWins: "+wins+"\t\tNetRunRate: "+netRunRate;
	}
}
