
import java.util.Scanner;


public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        
        switch(day){
            case 1:
                System.out.println("Mon");
            break;
            case 2:
                System.out.println("Tue");
            break;
            case 3:
                System.out.println("Wed");
            break;
            case 4:
                System.out.println("Thu");
            break;
            case 5:
                System.out.println("Fri");
            break;
            case 6:
                System.out.println("sat");
            break;
            case 7:
                System.out.println("Sun");
            break;
            default:
                System.out.println("Invalid Input");
        }
        
        
        
    }
}
