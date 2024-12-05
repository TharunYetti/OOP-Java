abstract class Animal{
	    String name;
	    int age;
	    String type;
	    String id;
	    Animal(String name,int age,String type,String id){
			this.name=name;
			this.age=age;
			this.type=type;
			this.id=id;
		}
	    abstract public void collectFood();
	    public void printData(){
			System.out.println("Name: "+name+" Age: "+age+" Type: "+type+" Id: "+id);
	    }
	    abstract public void makeSound();
	    
	
}
