class Politician extends Student implements Activities,ExtraActivities{
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
		System.out.println("Watch Movies");
	}
	public void visitPlaces(){
		System.out.println("Visit PLaces");
	}
	public void playGames(){
		System.out.println("Play Games");
	}
	public void doExercise(){
		System.out.println("Do Exercise");
	}
	public void writeExam(){
		System.out.println("For every five years politician have to writ exam");
	}
}
