// // package myPack;

// public class Student {
//      int id=1590;
//     private String department = "cse";
//     private String section = "A";
// }

// class CSE extends Student{
//     public String course = "Java Lab";
//     protected String teacher = "Simon sir";
//     public static void main(String[] args){
//         CSE obj1 = new CSE();
//         System.out.println("Your id is : "+ obj1.id);
//         // System.out.println("Your section is : "+ obj1.section);
//         // System.out.println("Your department is : "+ obj1.department);
//         System.out.println("Your course is : "+ obj1.course);
//         System.out.println("Your teacher is : "+ obj1.teacher);
//     }
// }
public class Student {
    int id = 1590;
    private String department = "cse";
    private String section = "A";
    public Student() {
        // Constructor that initializes the id
        // Other fields can remain with their default values
    }
    public String getDepartment() {
        return department;
    }

    public String getSection() {
        return section;
    }
}

class CSE extends Student {
    public String course = "Java Lab";
    protected String teacher = "Simon sir";

    public static void main(String[] args) {
        CSE obj1 = new CSE();
        System.out.println("Your id is: " + obj1.id);
        System.out.println("Your section is: " + obj1.getSection()); // Access via getter
        System.out.println("Your department is: " + obj1.getDepartment()); // Access via getter
        System.out.println("Your course is: " + obj1.course);
        System.out.println("Your teacher is: " + obj1.teacher);
    }
}
