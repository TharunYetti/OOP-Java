//WE CANNOT CREATE OBJECTS FOR ABSTRACT CLASSES, THEY SIMPLY ACT AS SUPER CLASSES INSTEAD OF CREATING OBJECTS
abstract class Animal{
	String name;
	String type;
	int age;
	String id;
	Animal(String name,String type,int age,String id){
		this.name=name;
		this.type=type;
		this.age=age;
		this.id=id;
	}
	abstract void makeSound();//if we dont want to implement method, we should keep it as abstract
	void countLegs(){
		System.out.println("Every animal will have 4 legs");
	}
	abstract void skinColour();
	abstract void getFood();
	void printData(){
		System.out.println("name="+name+" type="+type+" age="+age+" id="+id);
	}
}
