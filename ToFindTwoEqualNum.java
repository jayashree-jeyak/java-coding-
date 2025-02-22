import java.util.Scanner;
class ToFindTwoEqualNum{
    public static void main(String[] args) {
        System.out.println("enter two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
             System.err.println(a+ "is greater");
        }
        else if(a<b) {
            System.out.println(b+ "is greater");
        } else {
            System.out.println( "both are equal");
        }}
}
