class Player{
	static String country="INDIA"; 
	String name;
	int age;
	String game;
	float remuneration;
	int jerseyNo;
	Player(String name,int age,String game,float remuneration,int jerseyNo){
		this.name=name;
		this.age=age;
		this.game=game;
		this.remuneration=remuneration;
		this.jerseyNo=jerseyNo;
	} 
	void printData(){
		System.out.println("Name="+name+"\nAge="+age+"\nGame="+game+"\nRemuneration="+remuneration+"\nJersey Number="+jerseyNo);
	}
}
