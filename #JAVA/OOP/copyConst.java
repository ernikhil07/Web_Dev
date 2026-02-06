class Student{
    String name;
    int rln;
    String password;

    Student(){}

    Student(Student s1)
    {
        this.name=s1.name;
        this.rln=s1.rln;
    }
}

public class copyConst {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.name="Nikhil";
        s1.rln=131;
        s1.password="xyz";

        Student s2 = new Student(s1);
        s2.password="123";

        System.out.println(s2.name+"\n"+s2.rln+"\n"+s2.password);
    }
}
