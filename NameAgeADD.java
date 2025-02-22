import java.util.Scanner;
    class NameAgeAdd{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a= sc.nextLine();
            
            int b = sc.nextInt();
            sc.nextLine();
            String c= sc.nextLine();
            System.out.println("your name is:" +a);
            System.out.println("your age is:"+b);
            System.out.println("your address:"+c);
            
        }
    }
