import java.util.Scanner;
class Ifelseexp3{
    public static void main(String[] args) {
        System.out.println("enter your mark");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>34){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}