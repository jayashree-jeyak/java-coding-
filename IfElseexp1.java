
import java.util.Scanner;

class IfElseexp1{
    public static void main(String[] args) {
        System.out.print("enter about the match: ");
        Scanner sc=new Scanner(System.in);
        String RCB = sc.nextLine();
        if(RCB.equals("WIN")){
            System.out.println("Ee saala cup namdhe");
        }
        else{
            System.out.println("cup illa");
        }
    }
}