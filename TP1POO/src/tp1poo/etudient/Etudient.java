package tp1poo.etudient;
import java.util.Scanner;

public class Etudient {
      public static void main(String[] args) {
    	  Scanner input=new Scanner(System.in);
    	  System.out.println("Hello Then");
    	  System.out.println("Its working....i guess so Enter number");
    	  int i=input.nextInt();
    	  System.out.println("This is variable "+i);
    	  i=input.nextInt();
    	  System.out.println("Another variable "+i);
    	  input.close();
      }
}
