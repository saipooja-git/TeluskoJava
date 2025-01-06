public class AnonymousInnerMainClass extends AnonymousInnerClass{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Im here in anonymous inner class");
            }
        };
        obj.show();
    }
}