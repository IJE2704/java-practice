public class JavaMethods {
    static void MyMethod(){
        System.out.println("Why you call me bro");
    }

    static void MyName(String mname){
        System.out.println("Hei Bro! My name is : "+ mname);
    }

    static void MyInformation( int age, String location, String dob)
    {
        System.out.println("My age is : "+age);
        System.out.println("My location is : "+location);
        System.out.println("My Date of Birth is : "+dob);
    }

    static int NowMyTotalIncome(int previousHave,int newCome){
        return previousHave + newCome;
    } 

    // Now this function is check for overloading //
    static double myTableArea(double length, double width){
        return length * width;
    }
    static int myTableArea(int length, int width){
        return length * width;
    }

    public static void main(String[] args){
        MyMethod();
        MyName("Meraj Hossain");
        MyInformation(22, "Dhaka", "2002-1-1");
        System.out.println("Now i have : "+NowMyTotalIncome(300000, 2000));
        int area1 = myTableArea(40, 20);
        double area2 = myTableArea(40.3, 20.5);
        System.out.println("My area 1 is : "+area1+" My area 2 is : "+area2);
    }
}
