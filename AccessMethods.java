public class AccessMethods {
    public void carSpeed(){
        System.out.println("Car is going so fast");
    }

    public void maxSpeed(int speed){
        System.out.println("Car max speed is : " +speed);
    }

    public static void main(String[] args){
        AccessMethods obj = new AccessMethods();
        obj.carSpeed();
        obj.maxSpeed(80);
    }
}
