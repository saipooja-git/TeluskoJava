public class Inheritance extends AdvCalc{
    public static void main(String[] args) {
        VeryAdvCalc c =new VeryAdvCalc();
        int a = c.add(4,4);
        int b= c.mul(4, 5);
        double r = c.power(3, 2);
        System.out.println("The Addition result is : "+a);
        System.out.println("The multiplication result is : "+b);
        System.out.println("The power result is : "+r);

    }
}