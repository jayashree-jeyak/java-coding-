import java.util.Scanner;
class Ternaryoperator{
    public static void main(String[]args){
        System.out.print("is it raining?");
        Scanner sc = new Scanner(System.in);
        String signal = sc.nextLine();
        System.out.print(signal.equals("yes")?"umbrella":"enjoy the sunlight");

    }
}