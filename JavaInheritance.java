 public class JavaInheritance {
    protected String brand = "ford";
    public void honk(){
        System.out.println("peeeep Tuttt Tuttt");
    }
}

class car extends JavaInheritance{
    private String modelName = "Mustang";
    public static void main(String[] args){
        car obj = new car();
        System.out.println(obj.brand);
        obj.honk();
    }
}
