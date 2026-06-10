class Student{
    String name;
    int id;
    static String college ="ITM";

    Integer a1= 129;
    Integer a2= 129;
    

    void display(){
        //  System.out.println(a1==a2); //might give wrong answers on values above 100 
        System.out.println(a1.equals(a2));
        System.out.println("Info of Students--> ");
        
    }

    Student(int roll, String sname){
        id= roll;
        name= sname;
    }

}
class Faculty{
    String name;
    String Subject;
    int id;

    static void display1(){
        System.out.println("Hello Faculty");
    }

    void display(){
        System.out.println("\nInfo of Faculty--> ");
    }
    Faculty(String fname, String fsub, int fid){
        name = fname;
        Subject = fsub;
        id = fid;
    }
}


public class oops_prac {
    public static void main(String[] args) {
        Student obj1 = new Student(69, "Shivendra");
        Faculty obj2 = new Faculty("Mani", "DBMS", 1009);
        
        obj1.display();
        System.out.println("Name: "+obj1.name);
        System.out.println("Id: "+obj1.id );
        System.out.println("college: " + Student.college);

        obj2.display();
        System.out.println("Name: " + obj2.name +"\nSubject: "+ obj2.Subject + "\nID: "+obj2.id);
        
        Faculty.display1();

    }  
}
