
import java.util.Scanner;

public class Encapsulation{
    public static void main(String[] args) {

        HumanAge h = new HumanAge();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the born year of a person____");
        h.setBornYr(s.nextInt());
        System.out.println("Enter the current year____");
        h.setCurrentYr(s.nextInt());
       int Age= h.ageOfPerson(h.getBornYr(), h.getCurrentYr());
       System.out.println("Age of the person is, "+Age);

    }
}