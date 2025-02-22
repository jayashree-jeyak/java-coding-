import java.util.Scanner;
class Tables{
    public static void main(String[]args){
        System.out.print("enter a number: ");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i + "*" + a+ "=" +(i*a));
        }

    }
}