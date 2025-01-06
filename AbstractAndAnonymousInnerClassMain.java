public class AbstractAndAnonymousInnerClassMain extends AbstractAndAnonymousInnerClassB{
    public static void main(String[] args) {
        AbstractAndAnonymousInnerClass a = new AbstractAndAnonymousInnerClassB(){
            @Override
            public void show(){
                System.out.println("Iam in the abstract and anonymous inner class");
            }
        };
        a.show();
    }
}