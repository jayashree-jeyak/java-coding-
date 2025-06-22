import java.util.Scanner;
class Inc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR INCOME: ");
        int a=sc.nextInt();
        System.out.print("ENTER FOOD EXPENSES: ");
        int fd=sc.nextInt();
        System.out.print("ENTER TRAVEL EXPENSES: ");
        int tr =sc.nextInt();
        System.out.print("ENTER OTHER EXPENSES: ");
        int oth=sc.nextInt();
     System.out.println("--------EXPENSES CATEGORY---------");
     System.out.println("TOTAL SALARY: "+a);
     int tot=fd+tr+oth;
     System.out.println("TOTAL EXPENSE: "+tot);
     int diff=a-tot;
     System.out.println("SAVINGS: "+diff);

    }
}