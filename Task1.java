public class Task1 {
    public String name;
    public int id;

    private static int personCount = 0;

    public Task1(String name, int id){
        this.name = name;
        this.id = id;

        Task1.personCount++;
    }

    public void ShowInfo(){
        System.out.println("Name : " + name + ", Id : "+id);
    }

    public static int getPersonCount(){
        return personCount;
    }

    public static void main(){
        Task1 person1 = new Task1("Meraj", 1590);
        person1.ShowInfo();
        int count = getPersonCount();
        System.out.println(count);
    }
}
