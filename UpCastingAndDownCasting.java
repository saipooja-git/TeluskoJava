public class UpCastingAndDownCasting{
    public static void main(String []args){
        A a =(A) new B(); // upcasting // Refernce A object B 
        a.show1();

        B b =(B) a; // since here refernce A and also reference of A, so we need to downcast to get show2()
        b.show2();
    }

}