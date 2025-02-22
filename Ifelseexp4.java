import java.util.Scanner;
class Ifelseexp4{
    public static void main(String[] args){
        System.out.print("enter your income:");
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<7000){
            System.out.println("you are eligible for scholarship");
        
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}