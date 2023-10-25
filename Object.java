import java.util.*;
 class Student{
    String name="aman";
    // Subject obj2;//create object name student
    // Student(){//constructor jaise cll huha obj2 m value aa jaegyi Subject ki
    //     obj2=new Subject();
    // }
      class Subject{
        String name="java";
    }
}
public class Object{
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student obj=new Student();
        // System.out.println(obj.obj2.name);
        Student.Subject obj3= new Student().new Subject();
        System.out.println(obj3.name);
        
    }
}