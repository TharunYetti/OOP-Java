import java.util.*;
class PlayerDemo{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter your name");
		String name=scan.next();
		System.out.println("ENter your Age");
		int age=scan.nextInt();
		System.out.println("ENter your Game");
		String game=scan.next();
		System.out.println("ENter your Remuneration");
		int remuneration=scan.nextInt();
		System.out.println("ENter your Jersey Number");
		int jerseyNo=scan.nextInt();
		Player play=new Player(name,age,game,remuneration,jerseyNo);
		play.printData();
		System.out.println("COuntry:"+play.country);
	}
	
}
