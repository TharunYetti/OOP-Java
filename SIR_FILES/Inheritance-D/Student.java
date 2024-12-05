class Student extends Person implements ExtraActivites
{
	String id;
	float cgpa;
	Student(String name,int age,String pro,float height,String gen,String id,float cg)
	{
		super(name,age,pro,height,gen);
		this.id=id;
		this.cgpa=cg;
	}
	void checkCgpa()
	{
		System.out.println(name+" CGPA is: "+cgpa);
	}
	void checkRank(){
		System.out.println("for end exams.. ranks will be announced..");
	}
	void printData(){
		System.out.println("Name: "+name+" Age: "+age+" Profession: "+prof+" Height: "+height+"ID: "+id+" CGPA"+cgpa);
	}
	void canWork(){
		System.out.println(name+" during NSS/Campaigns, participated in work...");
	}
	public void doServices(){
		System.out.println("Students can participate in NSS/NCC ");
	}
	public void runCampaigns(){
		System.out.println("Students can run campaigns during college fests...");
	}
	public void playGames(){
		System.out.println("Students always play games...");
	}
	public void makeDonations(){
		System.out.println("through HHO organizations, students can donate...");
	}
	
}
