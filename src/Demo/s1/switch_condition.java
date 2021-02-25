package Demo.s1;
import java.util.Scanner;

public class switch_condition {
    public static void main (String[] args){
       int n;
       Scanner printer= new Scanner(System.in);
       System.out.println("Nhap so n: ");
       n = printer.nextInt();
       int b;
       b = printer.nextInt();
       switch (n){
           case 2:
               System.out.println("Day la thu 2");
               break;
           case 3:
               System.out.println("Day la thu 3");
               break;
           default:
               System.out.println("Hello guys");
               break;
       }

    }
}
