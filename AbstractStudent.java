public class AbstractStudent extends AbstractPerson{

    @Override
    public void grades() {
        System.out.println("Abstract Grades");
    }

    
    public int classesList(){
        System.out.println("2 Classes");
        return 2;
        }
}