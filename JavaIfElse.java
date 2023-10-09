public class JavaIfElse {
    public static void main(String[] args){
        int time = 20;
        if (time<20)
        {
            System.out.println("Good day bro");
        }
        else if(time==20)
        {
            System.out.println("Go for sleep bro");
        }
        else{
            System.out.println("Good night");
        }

        int money=50;
        String will_eat = (money>45) ? "Halim Khabo" : "Jhal mur";
        System.out.print(will_eat);
    }
}
