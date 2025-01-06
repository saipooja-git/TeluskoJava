public class AdvCalc extends Calc{
     public int mul(int n1,int n2){
        return n1*n2;
    }
     public int div(int n1,int n2){
        return n1/n2;
    }
    public double power(int n1,int n2){
        System.out.println("Hello I'm old method");
        return Math.pow(n1, n2);
    }
}