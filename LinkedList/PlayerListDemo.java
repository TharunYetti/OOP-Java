class PlayerListDemo{
	public static void main(String args[]){
		PlayerList sigma=new PlayerList();
		sigma.insert("MSD",45,7,12000000000.0);
		sigma.insert("Virat",35,18,13000000000.0);
		sigma.insert("Rohit",37,45,15000000000.0);
		sigma.insert("SKY",33,24,5000000000.0);
		sigma.insert("Hardik",28,33,8000000000.0);
		sigma.traversal();
		sigma.search(18);
		sigma.delete(7);
		sigma.insert("Bhumra",33,19,1000000000.0);
		sigma.traversal();
		sigma.sortByName();
		System.out.println("----------sorted----------");
		sigma.traversal();
		sigma.reverse();
		System.out.println("----------REVERSED--------");
		sigma.traversal();
	}
	
}
