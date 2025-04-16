import java.util.Scanner;
class Glenum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+ " is greater");
        }
        else if(b>a){
            System.out.println(b+ " is greater");
        }
        else{
            System.out.println("both are equal");
        }
    }
}