package PracticalOops;

public class Studentclass {
     public static class Student{
        String name;
        int roll_no;
        double percentage;
     }
     public static void change(Student x){
        x.name="Bhaskar";
        System.out.println(x.name);
     }
 
     public static void main(String[] args) {

        Student s1=new Student();
        s1.name="Dinkar";
        s1.roll_no=7;
        s1.percentage=90.7;
        System.out.println(s1.name);
        change(s1);
        
        
     }
    
}
