public class Mobile{
    String brand;
  static  String name;
    int price;

    void show() {
        System.out.println("Brand: "+brand+" / "+"Name: "+Mobile.name+" / "+"Price: "+price);
    }

    public static void show1(Mobile obj){
        System.out.println("Brand: "+obj.brand+" / "+"Name: "+Mobile.name+" / "+"Price: "+obj.price);

    }
}