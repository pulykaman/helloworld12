import java.util.Scanner;
 
class AddNumbers2
{
   public static void main(String args[])
   {
      add5(4, 5);
   }
 
   public static void add5(int a, int b){
      int c;

      Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
      b = in.nextInt();
      c = a + b;

   }
}
