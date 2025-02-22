import java.util.Scanner;
class Ifelseexp2{
    public static void main (String [] args){
        System.out.print ("how is meghna?:");
        Scanner sc=new Scanner(System.in);
        String meghna = sc.nextLine();
        if(meghna.equals("dead")){
            System.out.println("Surya meets priya:( ");
        }
        else{
            System.out.println("Surya and Meghna gets married:) ");
        }
    }
}