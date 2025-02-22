import java.util.Scanner;
class Department{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name:");
        String a=sc.nextLine();
        System.out.println("enter your mark:");
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("department:");
        String c= sc.nextLine();
        System.out.println("my name is:"+a);
        System.out.println("my mark is " +(b/10)+ "/10");
        System.out.println("my department is:"+c);
    }
}
