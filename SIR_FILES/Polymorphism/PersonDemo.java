class PersonDemo{
	public static void main(String args[]){
		Student s1=new Student("Karthi",8,"Politician","001",8.9f);
		s1.printData();
		s1.canWork();
		s1.writeExam();
		Person p1=new Person("Rahul",47,"Coach");
		p1.printData();
		p1.canWork();
		//p1.writeExam();
		Politician p2=new Politician("007", "Patel",60, 9.1f,"Lawyer", "INC","Trio");
		p2.printData();
		p2.canWork();
		p2.makeDonations();
		p2.runCampaigns();
		p2.doService();
		p2.watchMovies();
		p2.visitPlaces();
		p2.doExercise();
		p2.playGames();
		 System.out.println("-------- Polymorphism-----------\n");
		Student s2=new Politician("002","Rahul",45,8.7f,"Politician","INC","Trio");
		s2.printData();
		s2.writeExam();
		s2.canWork();
		//s2.doService();
		ExtraActivities e1=new Politician("003","Mamatha",57,8.5f,"Politician","TMC","Leaf");
		e1.watchMovies();
		e1.playGames();
		e1.visitPlaces();
		e1.doExercise();
		//e1.canWork();
	}
}
