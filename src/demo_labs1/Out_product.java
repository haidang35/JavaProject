package demo_labs1;

public class Out_product {
    public static void main(String[] args){

        Product prod1 = new Product();
        prod1 = new Product();
        prod1.Masanpham = "BMW";
        prod1.Tensp = "BMW i8";
        prod1.Giatien = 5000;
        prod1.Soluong = 5;
        prod1.Donvi = "Chiec";

        System.out.println("San pham 1");
        prod1.TangSoLuong(500);
        prod1.GiamSoluong(5);
        prod1.Thaydoigia(100000);
        prod1.run();
        prod1.Kiemtrahang();

        Product prod2 = new Product();
        prod2 = new Product();
        prod2.Masanpham = "KWS";
        prod2.Tensp = "ZX10R 2020";
        prod2.Giatien = 6500;
        prod2.Soluong = 15;
        prod2.Donvi = "Chiec";


        System.out.println("San pham 2");
        prod2.run();
        prod2.Kiemtrahang();

        System.out.println("San pham 3");
        Product prod3 = new Product();
        prod3 = new Product();
        prod3.Masanpham = "Yamaha";
        prod3.Tensp = "Yamaha R1 2019";
        prod3.Giatien = 7500;
        prod3.Soluong = 20;
        prod3.Donvi = "Chiec";
        prod3.run();
        prod3.Kiemtrahang();






    }
}
