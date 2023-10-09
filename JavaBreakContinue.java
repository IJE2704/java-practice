public class JavaBreakContinue {
    public static void main(String[] args){
        for(int i=1; i<10; i++)
        {
            if(i==4) continue;
            System.out.println(i);
        }
        int t=0;
        while(t<5){
            System.out.println("t : "+t);
            t++;
            if(t==3) break;
            
        }
    }

}
