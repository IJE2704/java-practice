 class Student{
    private String name;

    public Student(String name)
    {
      this.name = name;
    }

    
    public String gatValue(){
      return name;
    }
}

public class Main{
  int x =5;
  public static void main(String[] args) {
    Main obj = new Main();
    Student obj2 = new Student("Meraj Hossain");

    printValue(obj2);
  }
  public static void printValue(Student obj3)
  {
    String value = obj3.gatValue();
    System.out.println("value : "+value);
  }
}