public class VeryAdvCalc extends AdvCalc{
    @Override
    public double power(int n1,int n2){
        System.out.println("Hello I'm overriden ()");
        return Math.pow(n1, n2);
    }
}