import java.io.*;
class ASWO extends Thread{
	StudentBuffer sb;
	int n;
	ASWO(StudentBuffer s,int n){
		this.sb=s;
		this.n=n;
	}
	public void run(){
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			for(int i=1;i<=n;i++){
				System.out.println("Enter student details(name,maxLeaveDays,reason)");
				String name=br.readLine();
				int leaves=Integer.parseInt(br.readLine());
				String r=br.readLine();
				if(leaves>5){
					System.out.println("Outpass is rejected");
					sb.push(null);
					continue;
				}
				Student s=new Student(name,leaves,r);
				sb.push(s);
			}
		}catch(Exception e){}
	}
}
