public class InnerClassMain{
    public static void main(String[] args) {
        InnerClassA a = new InnerClassA();
        // a.show();

        InnerClassA.InnerClassB b = a.new InnerClassB();
        b.view();

        InnerClassA.C c = new InnerClassA.C();
        c.show();
    }
}