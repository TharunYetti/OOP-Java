public class Book{
	private String bName;
	private Author author;
	private double price;
	private int qty;
	private int pages;
	public Book(String bName,Author author,double price,int qty,int pages){
		this.bName=bName;
		this.author=author;
		this.price=price;
		this.qty=qty;
		this.pages=pages;
	}
	public String getBname(){
		return bName;
	}
	public Author getAuthor(){
		return author;
	}
	public String toString(){
		return "Book Name:"+bName+"\tAuthor Data:"+author+"\tPrice:"+price+"\tpages:"+pages+"\tqty:"+qty;
	}
}
