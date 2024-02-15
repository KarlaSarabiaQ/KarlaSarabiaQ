package PA1_Print.src.main.java;

public class StringFormat
{
   public static void main(String[] args)
   {
   
      String info = String.format( "Favorite Color: %s%nCurrent Weight: %.1f%nFirst Initial: %c%n","blue", 130.0f,'K');
      
      System.out.print( info );    
      
   }
}