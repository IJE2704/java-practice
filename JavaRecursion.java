public class JavaRecursion {
    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);
        int multiply = multiplication(4, 10);
        System.out.println(multiply);
    }

    public static int sum(int k){
        if(k>0){
            return k+sum(k-1);
        }
        else
        {
            return 0;
        }
    }

    // halting condition 
    public static int multiplication(int start, int end){
        if(end>start){
            return end * multiplication(start, end-1);
        }
        else{
            return end;
        }
    }
}
