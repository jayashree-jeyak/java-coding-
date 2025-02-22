import java.util.Scanner;
class Nestedifexp2{
    public static void main(String[] args) {
        System.out.println("enter you marks");
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        int average = (s1+s2+s3+s4+s5)/5;
        if(average<35){
            System.err.println("need additional class");
        }
        else{
            System.out.println("you are good to go");
        }
    }
}