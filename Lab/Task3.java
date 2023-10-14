// Source code is decompiled from a .class file using FernFlower decompiler.

import java.util.Scanner;

public class Task3 {
   public String name;
   public int id;
   private static int personCount = 0;

   public Task3(String var1, int var2) {
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
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = sc.nextLine();
    System.out.println("Enter your id : ");
    int id = sc.nextInt();
    
      Task3 var0 = new Task3(name, id);
      var0.ShowInfo();
      int var1 = getPersonCount();
      System.out.println(var1);
   }
}
