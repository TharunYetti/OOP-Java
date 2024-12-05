class Player{
	String name;
	int totalRuns;
	double average;
	Player next;
	Player(String n,int tr,double avg){
		this.name=n;
		this.totalRuns=tr;
		this.average=avg;
	}
	public String toString(){
		return name+" "+totalRuns+" "+average;
	}
}
