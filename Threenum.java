import java.util.Scanner;
 class Threenum{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first num:");
    int a=sc.nextInt();
    System.out.println("enter the second num:");
    int b=sc.nextInt();
    System.out.println("enter the third num:");
    int c=sc.nextInt();
    int d = a*b*c;
    int e = a+b+c;
    int f= d/e;
    System.out.println(f);

}
}