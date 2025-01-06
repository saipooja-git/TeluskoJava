
public class Arrays{
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(num[2]);
        System.out.println(num[0]);
        System.out.println(num[1]);

        int n[]= new int[4];
        n[0]=23;
        n[1]=24;
        n[2]=25;
        System.out.println(n[0]);          
        System.out.println(n[2]);
        System.out.println(n[3]);
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);

        }
//multidimensional array

int ne[][] = new int[3][4];
int random=0;
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
    ne[i][j]=(int)(Math.random()*10);
}

}
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++){

        System.out.print(ne[i][j]+" ");
}
  System.out.println(); // Move to the next row

}
System.out.println("Enhanced For Loop");
for(int nu[]:ne){
    for(int m:nu){
        System.out.print(m+" ");
    }
    System.out.println(" ");
}
System.out.println("Jagged array's");
int li[][]=new int[3][];
li[0]=new int[3];
li[1]=new int[2];
li[2]=new int[4];

for (int i = 0; i < li.length; i++) {
    for (int j = 0; j < li[i].length; j++) {
        li[i][j] =(int)(Math.random()*100);
    }
}
for(int nv[]:li){
    for(int h:nv){
        System.out.print(h+" ");
    }
    System.out.println(" ");
}
System.out.println("Array of students");


Students s1 = new Students();
s1.rollno=1;
s1.name ="Pooja";
s1.marksf = 95;

Students s2 = new Students();
s2.rollno=2;
s2.name="Ujwal";
s2.marksf=92;

Students s3 = new Students();
s3.rollno=3;
s3.name="Avinash";
s3.marksf=91;

Students student[] = new Students[3];
student[0]=s1;
student[1]=s2;
student[2]=s3;

for(int i = 0;i<student.length;i++){
    System.out.print("Name: "+student[i].name+" "+"Marks: "+student[i].marksf);
    System.out.println(" ");
}
System.out.println("Enhanced for loop for student object");
for(Students s :student){
     System.out.print("Name: "+s.name+" "+"Marks: "+s.marksf);
    System.out.println(" ");
}
    }

}