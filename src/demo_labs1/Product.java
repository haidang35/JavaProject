package demo_labs1;

public class Product{
    String Masanpham;
    String Tensp;
    double Giatien;
    int Soluong;
    String Donvi;

    void TangSoLuong(int a){
        Soluong=Soluong + a;
    }
    void GiamSoluong(int a){
        if(Soluong > 0 && a<=Soluong){
            Soluong=Soluong - a;
        }else{
            System.out.println("Khong the giam so luong");
        }
        // Soluong = Soluong+a?Soluong+a:0

    }
    void Thaydoigia(int b){
        if(Giatien > 0){
            Giatien=b;
        }else{
            System.out.println("Thay doi gia tien that bai");
        }

    }
    void Kiemtrahang(){
        if(Soluong >0){
            System.out.println("San pham con hang");
        }else{
            System.out.println("San pham het hang");
        }
    }
    void run(){
        System.out.println("Ma san pham: "+Masanpham);
        System.out.println("Ten san pham: "+Tensp);
        System.out.println("Gia tien: "+Giatien);
        System.out.println("So luong: " + Soluong);
        System.out.println("Don vi: "+ Donvi);
    }


}
