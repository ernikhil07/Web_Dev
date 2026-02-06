import java.util.*;
public class areaOfCircle {
    public static void main(String args[]){
        float pi=3.14f;
        System.out.print("Enter radious of circle: ");
        Scanner sc=new Scanner(System.in);
        float r=sc.nextInt();
        float Area=pi*r*r;
        System.out.print("Area of circle is: " + Area);
        sc.close();
    }
}
