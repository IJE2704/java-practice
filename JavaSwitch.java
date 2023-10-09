import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter daya : ");
        int day = scanner.nextInt();
        switch(day){
            case 1:
            System.out.println("Saturday");
            break;
            case 2:
            System.out.println("Sunday");
            break;
            case 3:
            System.out.println("Monday");
            break;
            case 4:
            System.out.println("Tuesday");
            break;
            default:
            System.out.println("Look");
        }
    }
}
