import java.util.Scanner;
class Forloop4{
    public static void main(String[] args) {
        System.out.print("enter the number a and b:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}