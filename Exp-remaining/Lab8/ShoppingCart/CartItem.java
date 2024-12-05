class CartItem{
	String productId;
	String pName;
	double price;
	int qty=0;
	CartItem next;
	CartItem(String pId,String pn,double price,int qty){
		this.productId=pId;
		this.pName=pn;
		this.price=price;
		this.qty=qty;
		this.next=null;
	}
	public String toString(){
		return productId+" "+pName+" "+price+" "+qty;
	}
}
