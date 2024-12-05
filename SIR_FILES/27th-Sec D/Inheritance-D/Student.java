class Student extends Person implements ExtraActivites,Entertainment
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
	public String toString(){
		return ("Name: "+name+" Age: "+age+" Profession: "+prof+" Height: "+height+"ID: "+id+" CGPA"+cgpa);
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
	public void watchMovies(){
		System.out.println("Students frequently watch movies");
	}
	   public void funGames(){
		   System.out.println("Daily students play fun games");
	   }
	   public void doDance(){
		   System.out.println("Any student can dance");
	   }
	   public void makeTrip(){
		   System.out.println("With family students plan trips..");
	   }
	   public void culturals(){
		System.out.println(name+" can participate in cultural activities");
	   }
		public void foodStalls(){
			System.out.println(name+" can visit the food stalls");
		}
		public void flashmob(){
			System.out.println(name+" can participate in flashmobs");
		}
		public void makeArts(){
			System.out.println(name+" can prepare paper arts...");
		}
	
}
