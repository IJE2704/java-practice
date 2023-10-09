public class ForLoop {
    public static void main(String[] args){
        int n=10;
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=n; j++)
            {
                System.out.println("Hei i am from : "+i+" and you "+j+" in me");
            }
        }
        System.out.println("Now we are going to talk about Cars");
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for(String k: cars){
            System.out.println(k);
        }
    }
}
