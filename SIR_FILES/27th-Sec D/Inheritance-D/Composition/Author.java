public class Author{
	private String name;
	private String email;
	private char gen;
	public Author(String name,String mail, char gen){
		this.name=name;
		this.email=mail;
		this.gen=gen;
	}
	public String getName(){
		return this.name;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String mail){
		this.email=mail;
	}
	public char getGender(){
		return this.gen;
	}
	public String toString(){
		return this.name+" "+this.email+" "+this.gen;
	}
	
}
