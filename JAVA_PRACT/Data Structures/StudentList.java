class StudentList{
	Student start,end;
	int count=0;
	Student current=null,pre=null,post=null;
	public void add(String n,int roll){
		Student s=new Student(n,roll);
		if(start==null){
			start=end=s;
		}
		else{
			end.next=s;
			end=s;
		}
		count++;
	}
	public void delete(String n){
		current=start;
		if(current.name.equals(n)){
			start=current.next;
			count--;
		}
		else{
			while(current.next.next!=null){
				if(current.next.name.equals(n)){
					current.next=current.next.next;
					count--;
				}
				current=current.next;
			}
			if(current.next.name.equals(n)){
				current.next=null;
				end=current;
				count--;
			}
		}
	}
	public void search(String n){
		int flag=0;
		current=start;
		while(current!=null){
			if(current.name.equals(n)){
				flag=1;
				break;
			}
			current=current.next;
		}
		if(flag==1){
			System.out.println(current);
		}
		else{
			System.out.pritln("Not found");
		}
	}
	public void sort(){
		int out=count-1;
		while(out>0){
			current=start;pre=null;post=start.next;
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
					pre=current;current=post;post=current.next;
				}
				in++;
			}
			out--;
		}
	}
}
