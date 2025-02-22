import java.util.Scanner;
class EvenorOdd{
    public static void main(String[] args) {
        System.err.print("enter a number: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+ "  is even");
        }
        else{
            System.err.println(a+ "  is odd");
        }
    }
}