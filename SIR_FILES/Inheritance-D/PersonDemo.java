class PersonDemo{
	public static void main(String args[]){
		Student s1=new Student("Bhavya",6,"Politician",3.5f,"FeMale","007",8.9f);	
		s1.printData();
		s1.canWork();
		s1.canRun();
		s1.checkCgpa();
		s1.checkRank();
		s1.makeDonations();
		s1.doServices();
		s1.playGames();
		s1.runCampaigns();
		
		Person p1=new Person("APJ",80,"Scientist",5.8f,"Male");
		p1.printData();
		p1.canWork();
		p1.canRun();
	}
}
