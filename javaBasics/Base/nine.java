import java.util.Scanner;

public class nine { 
    public static void main(String[] args) {
    //     //understand switch case ;
        Scanner sc = new Scanner(System.in);
    //     int num = sc.nextInt();
    //     switch(num){
    //         case 1: System.out.println("hello");
    //         break;
    //         case 2: System.out.println("namaste");
    //         break;
    //         default: System.out.println("invalid");
    //     }
              //nested switch case ;
              int empId = sc.nextInt();
              String department = sc.next();
              switch(empId){
                case 1 : System.out.println("john ");
                break;
                case 2 : System.out.println("jane");
                break;
                case 3 : switch(department){
                    case "it" : System.out.println(" dept is it");
                    break;
                    case "management" : System.out.println("dept is management");
                    break;
                    case "hr" : System.out.println("hr dept ....");
                    break;
                    default : System.out.println("invalid dept");
                }
                break;
                default : System.out.println("entre valid id");
              }

    }
}
