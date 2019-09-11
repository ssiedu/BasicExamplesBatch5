
import java.util.Scanner;


public class SwitchCaseTwo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter State : ");
        String state=sc.next();
        
        switch(state){
            case "MP":
                System.out.println("Bhopal");
            break;
            case "MH":
                System.out.println("Mumbai");
            break;
            case "RJ":
                System.out.println("Jaipur");
            break;
            default:
                System.out.println("Wrong Input");
        }
    }
}
