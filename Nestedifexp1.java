import java.util.Scanner;
class Nestedifexp1{
    public static void main(String[] args) {
        System.out.print("enter your score in the game: ");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        if(a<50){
            System.out.println("You need to improve!!");
        }
        else if(a>=50 && a<=70){
            System.out.println("good job!");
        }
        else{
            System.out.println("excellent performance");
        }
    }
}