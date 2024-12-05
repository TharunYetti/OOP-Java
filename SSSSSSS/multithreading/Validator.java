import java.io.*;
public class Validator extends Thread{
    StudentBuffer sb;
    int count;
    Validator(StudentBuffer sb,int n)
    {
        this.sb=sb;
        this.count=n;
    }
    public void run()
    {
        try{
            FileWriter fw=new FileWriter("student.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=1;i<=count;i++)
            {
                Student s=sb.pop();
               
                try{
                    if(s.age>23 && s.age<35)
                    {
                        throw new AgeException(s.age);
                    }
                    else{
                        bw.write(s+"\n");
                        System.out.println("Accessed:"+s);
                    }
                }catch(AgeException ae)
                {
                    System.out.println(ae);
                }
               
            }
            bw.close();
            fw.close();
        }catch(Exception e){}
    }
}

