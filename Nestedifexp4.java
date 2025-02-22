
import java.util.Scanner;

class Nestedifexp4{
    public static void main(String[]args){
      System.out.print("enter your age:");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      System.out.print("enter your salary:");
      int b=sc.nextInt();
      if(b>=20000 || a<=25){
        System.out.println("enter your loan amount:");
        int c=sc.nextInt();
        if(c<=50000){
            System.out.println("you are eligible for the loan");
        }
        else{
            System.out.println("max amount is 50000rs only");
        }
      }
      else{
        System.out.println("you are not eligible for the loan");
      }
    }
}