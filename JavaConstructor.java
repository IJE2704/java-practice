public class JavaConstructor {
    int ModelYear;
    String modelName ;

    public JavaConstructor(int year,String name){
        ModelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        JavaConstructor obj = new JavaConstructor(2002, "BMWk20");
        System.out.println(obj.modelName+ " " +obj.ModelYear);
    }
}
