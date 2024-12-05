class Student{
    String name;
    String id;
    int age;
    String mail;
    Student(String name,String id,int age,String mail)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.mail=mail;
    }
    public String toString()
    {
        return "Name:"+this.name+" "+"ID:"+this.id+" "+"Age:"+this.age+" "+"Mail:"+this.mail;
    }
}