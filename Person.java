public class Person {
    private String name;
    private int id;

    private static int personCount = 0;

    public void setName(String n) {
        this.name = n;
        personCount++;
    }

    public String getName() {
        return name;
    }

    public void ShowInfo() {
        System.out.println("Name : " + name + ", Id : " + id);
    }

    public static void main(String[] args) {
        Person s = new Person();
        s.setName("Meraj");
        String name = s.getName();
        System.out.println(name);
        System.out.println(s.personCount);

        //  Person s1 = new Person();
        s.setName("Zayed");
        String name2 = s.getName();
        System.out.println(name2);
        System.out.println(s.personCount);

        //  Person s2 = new Person();
        s.setName("Pushpa");
        String name3 = s.getName();
        System.out.println(name3);
        System.out.println(s.personCount);

    }
}
