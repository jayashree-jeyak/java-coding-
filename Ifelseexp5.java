import java.util.Scanner;
class Ifelseexp5{
    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a%5==0 && a%3==0){
            System.err.println("the number is divisible by both 3 and 5");
        }
        else if (a%3==0){
            System.out.println("the number is divisible by 3");
        }
        else if (a%5==0){
            System.out.println("the number is divisible by 5");
        }
        else{
            System.out.println("the number is not divisible by 3 and 5");
        }
    }
}