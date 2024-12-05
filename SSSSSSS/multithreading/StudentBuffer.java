public class StudentBuffer {
    Student s1;
    boolean status;
    synchronized public void insert(Student s){
    	System.out.println("StudentBuffer");
        if(status){
            try{
                wait();
            }catch(InterruptedException ie){
                System.out.println(ie);
            }
        }
        this.s1=s;
        status=true;
        notify();
    }
    synchronized public Student pop(){
        if(!status){
            try{
                wait();
            }catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }
        status=false;
        notify();
        return this.s1;
    }
}
