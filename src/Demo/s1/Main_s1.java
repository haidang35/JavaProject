package Demo.s1;

public class Main_s1 {
    public static void main(String[] args){
        int a = 15;
        int b = 16;
        int max = Math.max(a,b);
        System.out.println("Gia tri lon nhat la: "+ max);
        System.out.println("Lam tron len: "+ Math.ceil(73.6));
        System.out.println("Lam tron xuong: "+ Math.floor(73.6));
        System.out.println("Lam tron voi round: "+ Math.round(73.6));
        System.out.println("Tao mot so ngau nhien trong khoang tu 0 den 1: "+ Math.random());
        int Max = 100;
        int Min = 30;
        int range = (Max - Min) + 1;
        int randomNumber = 0;
        randomNumber = (int) (Math.random()*range) + Min;
        System.out.println("random: "+ randomNumber);

    }
}
