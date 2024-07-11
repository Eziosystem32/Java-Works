package Pack2;
import java.util.*;

public class Student {
    private String name;
    private int age;
    private String Gender;
    private int ID_No;
    private static String SCHOOL_NAME;
    private static String section;

    Student(String name, int age, String Gender, Int ID_No){
        this.name = name;
        this.age = age;
        this.Gender = Gender;
        this.ID_No = ID_No;
    }
    {
        System.out.println("welcom to "+ SCHOOL_NAME);
    }
    static{
        SCHOOL_NAME="HiLCoE";
    }
    static void sort(){
        Student student = new Student();
        char ch = student.name. charAt(1);
        if(ch>='A'&& ch<='H'){
        section = "A";
        }
        else if(ch>='I'&& ch<='M'){
        section = "B";
        }
        else{
        section="C";
        }

    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your Gender");
        Gender = sc.next();
        System.out.println("Enter your ID_No");
        ID_No = sc.nextInt();
        
    }
    public void Desplay(){

    }
    
}
