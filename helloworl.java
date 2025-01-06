public class helloworl{
    public static void main(String [] args){
        System.out.println("Hello World...!");

        char c = 'a';
        c++;
        System.out.println(c);

        int num=10_00_00_000;
        System.out.println(num);

        int i = 5 ;
        float f =(float) i;
        System.out.println(i);

        int num1 = 7;
        int result = num1++;
        System.out.println(result+"the value of result");
        System.out.println(num1+"the value of num1");

        int num2 = 5;
        int res = ++num2;
        System.out.println("The value of res is"+res);
        System.out.println("The value of num2 is"+num2);

        int n=1;
        if(n==1){
            System.out.println("Monday");
        }
        else if(n==2){
            System.out.println("Tuesday");
        }
        else if(n==3){
            System.out.println("Wednesday");
        }
        else if(n==4){
            System.out.println("Thursday");
        }
        else if(n==5){
            System.out.println("Friday");
        }
        else if(n==6){
            System.out.println("Saturday");
        }
        else if (n==7){
            System.out.println("Sunday");
        }

        // switch (n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;

        //     default:
        //         System.out.println("Enter a number which is in range  ");;
        // }

        // int x =1;
        // while(x<=5){
        //     System.out.println("Hi");
        //     x++;
        // }
        System.out.println("Double condition in while loop called nested loop");
        int xz=1;
        while(xz<=5){
            System.out.println("hey");
            int xy=1;
            while(xy<=3){
                System.out.println("HRU?");
                xy++;
            }
            xz++;
        }
        // int y=1;
        // do {
        //     System.out.println("Hello");
        //     y++;
        // }while(y<=5);
        System.out.println("double condition in do while loop called nested loop");
        int xb=1;
        do{
            System.out.println("Aap");
            int xa=1;
            do { 
               System.out.println("Kaise ho"); 
               xa++;
            } while (xa<=3);
            xb++;
        }while(xb<=5);

        // for(int z=0;z<=5;z++){
        //     System.out.println("Hola");
        // }
        System.out.println("Double condition in for loop");
        for(int cb =1;cb<=5;cb++){
            System.out.println("Namaskaram");
            for(int o=1;o<=3;o++){
                System.out.println("Bagunara");
            }
        }
    }
}