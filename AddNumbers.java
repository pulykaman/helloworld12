import java.util.Scanner;
 
class AddNumbers
{
   public static void main(String args[])
   {
      add(4, 5);
   }
   
   public static void add(int x, int y){
      int z;
      
      System.out.println("Enter two integers to calculate their sum");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
 
      System.out.println("Sum of the integers = " + z);
   }
   
}
