public class HumanAge{
   private int bornYr;
   private String name;
   private int currentYr;

    public HumanAge() {
        this.bornYr=bornYr;
        this.name=name;
        this.currentYr=currentYr;
    }

    public int getBornYr() {
        return bornYr;
    }

    public void setBornYr(int bornYr) {
        this.bornYr = bornYr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentYr() {
        return currentYr;
    }

    public void setCurrentYr(int currentYr) {
        this.currentYr = currentYr;
    }
    
    public int ageOfPerson(int currentYr,int bornYr){
        return bornYr - currentYr;
    }
   
}