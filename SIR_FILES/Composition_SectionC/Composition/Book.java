public class Book{
	private String bName;
	private Author author;
	private double price;
	private int qty;
	private int pages;
	public Book(String name,Author aut,double price,int qt,int pg){
		this.bName=name;
		this.author=aut;
		this.price=price;
		this.qty=qt;
		this.pages=pg;
	}
	public String toString(){
		return "Book Name: "+bName+" AuthorData: "+author+" Price: "+price+" Quantity: "+qty+" Pages: "+pages;
	}
	public String getBook(){
		return bName;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double p){
		price=p;
	}
	public int getQty(){
		return qty;
	}
	public void setQty(int q){
		qty=q;
	}
	public Author getAuthor(){
		return author;
	}
	
	
} 
