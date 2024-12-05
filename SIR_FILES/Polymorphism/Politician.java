class Politician extends Student implements ExtraActivities{
	String pName;
	String symbol;
	Politician(String id, String name,int age, float cg,String pro, String pn,String sy )
	{
		super(name,age,pro,id,cg);
	}
	public void doService(){
		System.out.println(name+" as a politician... he must do social service...");
	}
	public void runCampaigns(){
	System.out.println(name+" as a politician... he must run campaigns...");
	}
	public void makeDonations()
	{
		System.out.println(name+" as a politician... he must make donations...");
	}
	public void watchMovies(){
		System.out.println(name+" frequently watches movies");
	}
	public void visitPlaces(){
		System.out.println(name+" visit places daily");
	}
	public void playGames(){
		System.out.println(name+" often play games");
	}
	public void doExercise(){
		System.out.println(name+" As a Politician, he/she can do exercise");
	}
	public void writeExam(){
		System.out.println("For Every 5 years politicians have to write exams... ");
	}
}
