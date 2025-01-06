public class Static{
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.brand="Apple";
        Mobile.name="Smart phone";
        m.price=1_00_000;

        Mobile m1 = new Mobile();
        m1.brand="Samsung";
        Mobile.name="Smart phone";
        m1.price=1_00_000;

        m.show();
        m1.show();

        Mobile.show1(m);
    }
}