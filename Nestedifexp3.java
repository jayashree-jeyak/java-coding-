import java.util.Scanner;
class Nestedifexp3{
    public static void main(String [] args){
        System.out.print("enter the color of traffic light:");
        Scanner sc=new Scanner(System.in);
        String color = sc.nextLine();
        if(color.equals( "red"))
        {
          System.out.println("STOP");
        }
        else if(color.equals("green")){
            System.out.println("GO");
        }
        else{
            System.out.println("WAIT");
        }
    }
}