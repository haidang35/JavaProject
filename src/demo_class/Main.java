package demo_class;

public class Main {
    public static void main(String[] args){
        // Car c = new Car();//tao doi tuong tu lop Car


        Car c = new Car(); // tao doi tuong tu lop Car - chua co o nho
        c = new Car(); //tao 1 o nho co kick thuoc bang lop Car cho c -- tao doi tuong
        c.brand = "Toyota";
        c.run();
        // tao mot doi tuong Car khac
        Car c2 = new Car();
        c2.brand = "BMW";
        c2.run();
    }
}
