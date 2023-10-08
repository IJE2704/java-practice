
public class PracticeRules {
    public static void main(String[] args) {
        // get the string length
        String txt = "Hi i am meraj hossain";
        System.out.println("Text size is : " + txt.length());

        // make the string uppercase
        System.out.println(txt.toUpperCase());

        // make the string lowercase
        System.out.println(txt.toLowerCase());

        // finding a character in string
        System.out.println(txt.indexOf("meraj"));

        // concatenation
        String fristName = "Meraj";
        String seconName = "Hossain";
        System.out.println("Full name is : " + fristName + " " + seconName);
        // another way to concatenation
        System.out.println("Full name 2: " + fristName.concat(seconName));

        int x = 10;
        int y = 20;
        // find the maximum number
        int a = Math.max(x, y);
        System.out.println(a);

        // find the minimum number
        a = Math.min(x, y);
        System.out.println(a);

        // square of numbers
        double b = Math.sqrt(a);
        System.out.println(b);

        // returns the absolute positive value
        double d = -4.7;
        System.out.println("After using abs : " + Math.abs(d));

        // for random numbers
        // int e = Math.random();
        // System.out.println(e);
    }
}
