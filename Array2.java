// get input for 5 numbers using array and for loop
import java.util.Scanner;
class Array2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        System.out.println("Enter your 5 numbers");
        for(int i=0;i<=4;i++){
            
            num[i]=sc.nextInt();
        }
        for(int i=0;i<=4;i++){
            System.out.println(num[i]);
        }
    }
}