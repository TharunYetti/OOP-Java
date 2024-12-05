class AmazonStore{
	int count=0;
	Laptop l,current,pre,post,start=null,end=null;
	public void add(String mn, String sno, double p){
		l=new Laptop(mn,sno,p);
		if(start==null){
			start=end=l;
			count++;
		}
		else{
			end.next=l;
			end=l;
			count++;
		}
		System.out.println("Successfully added the Laptop of given type");
	}
	public void update(String sno,String nsno){
		current=start;
		int flag=0;
		while(current!=null){
			if(current.sNo.equals(sno)){
				current.sNo=nsno;
				flag++;
				break;
			}
			current=current.next;
		}
		if(flag>0){
			System.out.println("Successfully updated the Laptop Serial Number");
		}
		else{
			System.out.println(sno+" Not found");
		}
	}
	public void display(){
		current=start;
		while(current!=null){
			System.out.println(current);
			current=current.next;
		}
	}
	public void remove(String sno){
		current=start;
		if(current.sNo.equals(sno)){
			start=start.next;
			count--;
		}
		else{
			while(current.next.next!=null){
				if(current.next.sNo.equals(sno)){
					current.next=current.next.next;
					count--;
				}
				current=current.next;
			}
			if(current.next.sNo.equals(sno)){
				end=current;
				end.next=null;
				count--;
			}
		}
	}
	public void sort(){
		int out=count-1;
		while(out>0){
			pre=null;current=start;post=current.next;
			int in=0;
			while(in<out){
				if(current.price>post.price){
					current.next=post.next;
					post.next=current;
					if(pre==null){
						start=post;
					}
					else{
						pre.next=post;
					}
					pre=post;
					post=current.next;
				}
				else{
					pre=current;current=post;post=current.next;
				}
				in++;
			}
			out--;
		}
	}
}
