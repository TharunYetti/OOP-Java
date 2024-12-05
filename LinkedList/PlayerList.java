class PlayerList{
	Player start,end;
	int count;
	void insert(String n,int age,int j,double r){
		Player p=new Player(n,age,j,r);
		if(start==null){
			start=end=p;
			count++;
		}
		else{
			end.next=p;
			end=p;
			count++;
		}
	}
	void traversal(){
		Player current=start;
		while(current!=null){
			System.out.println(current);
			current=current.next;
		}
	}
	void search(int key){
		Player current=start;
		int flag=0;
		while(current!=null){
			if(current.jNo==key){
				flag++;
				break;
			}
			else{
				current=current.next;
			}
		}
		if(flag>0){
			System.out.println("Key found:"+current);
		}
		else{
			System.out.println("Not found");
		}
	}
	void delete(int key){
		Player current=start;
		if(current.jNo==key){
			start=current.next;
			count--;
		}
		else{
			while(current.next.next!=null){
				if(current.jNo==key){
					current.next=current.next.next;
					count--;
				}
				else current=current.next;
			}
			if(current.next.jNo==key){
				end=current;
				end.next=null;
				count--;
			}
		}
	}
	void sortByName(){
		Player pre=null,current=null,post=null;
		int out=count-1;
		while(out>0){
			pre=null;current=start;post=current.next;
			int in=0;
			while(in<out){
				if(current.name.compareTo(post.name)>0){
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
					pre=current;
					current=post;
					post=post.next;
				}
				in++;
			}
			out--;
		}
	}
}
