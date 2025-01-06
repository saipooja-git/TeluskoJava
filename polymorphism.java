public class polymorphism{
    public static void main(String[] args) {
        A a = new B(); //late binding polymorphism
        a.show();
        A a1 = new A();
        a1.show();
        a1 = new C();
        a1.show();
    }
}

// Iam B
// Iam A
// Iam C