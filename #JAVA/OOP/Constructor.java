public class Constructor {
    public static void main(String args[])
    {
        A a=new A();
    }
    
    
}
class A{
       String name ="NIKHIL"; 
    A()
        {
            System.out.println("Constructor is called");
        }
    A(String name)
    {
        this.name=name;
        System.out.println(name);
    }
        
    }
    

