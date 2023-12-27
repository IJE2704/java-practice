public class Inheritance{
  public static void main(String[] args){
    Student st = new Student();
    st.name = "Meraj Hossain";
    st.age = 22;
    st.id = 1590;
    st.DisInfo2();;
  }
}
public class Person{
  String name;
  int age;
  public void DisInfo(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
  }
}
public class Student extends Person{
  int id;
  public void DisInfo2(){
    DisInfo();
    System.out.println("Id : "+id);
  }
}

