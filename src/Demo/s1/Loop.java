package Demo.s1;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args){

        Scanner printer= new Scanner(System.in);
        int n;
        System.out.println("Nhap n= ");
        n = printer.nextInt();

//        for(int i=0;i<n;i++){
//            System.out.println("Dang Jinner is King of Code");
//        }

//        int j=0;
//        while(j<n){
//            System.out.println("Jinner");
//            j++;
//        }

        int k=12;
        do{
            System.out.println("Jinner");
            k++;
        }while(k<n);
    }
}
