package Base;
import java.util.Scanner;

public class if_else_4 {
    public static void main(String[] args) {
        // int a = 18 ;
        // if(a>10) {
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("no");
        // }

        // int count = 0 ;
        // while (count < 10 ) {
        //     System.out.println(count);
        //     count++;
        // }

        Scanner input = new Scanner(System.in);

        System.out.println("enter salary : ");
        int salary = input.nextInt();
        if(salary > 10000) {
            salary = salary + 2000;
        } else if(salary > 20000) {
            salary = salary + 3000;
        }
        else{
            salary += 1000;
        }
        System.out.println("salary after bounes : "+salary);










    }
}
