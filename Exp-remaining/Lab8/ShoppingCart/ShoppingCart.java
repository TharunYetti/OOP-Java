class ShoppingCart{
	CartItem start,end;
	int count=0;
	public void add(String pId,String pName,double price,int qty){
		CartItem node=new CartItem(pId,pName,price,qty);
		if(start==null){
			start=end=node;
			count++;
		}
		else{
			end.next=node;
			end=node;
			count++;
		}
	}
	public void update(String prodId,int qty){
		CartItem current=start;
		int flag=0;
		while(current!=null){
			if(current.productId.equals(prodId)){
				current.qty=qty;	flag++;
				break;
			}
			current=current.next;
		}
		if(flag>0)	System.out.println("Quantity Updated.."+current);
		else	System.out.println(prodId+" not existed");
	}
	public void display(){
		CartItem current=start;
		while(current!=null){
			System.out.println(current);
			current=current.next;
		}
	}
	public void remove(String prodId){
		CartItem current=start;
		if(current.productId.equals(prodId)){
			start=current.next;
			count--;
		}
		else{
			while(current.next.next!=null){
				if(current.next.productId.equals(prodId)){
					current.next=current.next.next;
					count--;
					break;
				}
				current=current.next;
			}
			if(current.next.productId.equals(prodId)){
				end=current;
				end.next=null;
				count--;
			}
		}
	}
	void sortByName(){
		CartItem pre,current,post;
		int out=count-1;
		while(out>0){
			int in=0;
			pre=null;current=start;post=current.next;
			while(in<out){
				if(current.pName.compareTo(post.pName)>0){
					current.next=post.next;
					post.next=current;
					if(pre==null)	start=post;
					else	pre.next=post;
					pre=post;
					post=current.next;
				}
				else{
					pre=current;
					current=post;
					post=current.next;
				}
				in++;
			}
			out--;
		}
	}
}
