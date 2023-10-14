
public class Task1 {
   public String name;
   public int id;
   private static int personCount = 0;

   public Task1(String var1, int var2) {
      this.name = var1;
      this.id = var2;
      ++personCount;
   }

   public void ShowInfo() {
      System.out.println("Name : " + this.name + ", Id : " + this.id);
   }

   public static int getPersonCount() {
      return personCount;
   }

   public static void main(String[] args) {
      Task1 var0 = new Task1("Meraj", 1590);
      var0.ShowInfo();
      int var1 = getPersonCount();
      System.out.println(var1);
   }
}
