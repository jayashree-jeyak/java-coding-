import java.util.Scanner;
class Array1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] num= new int[5];
        System.out.println("Enter your 5 subject marks");
        num[0]=sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        num[3]=sc.nextInt();
        num[4]=sc.nextInt();
        System.out.println("the total mark is " +(num[0]+num[1]+num[2]+num[3]+num[4]));
    }
}