//Create a class called "School" with main function
//Create a function called passorfail which should return the string "Pass/Fail"
//Inside Main function get integer input from user for total mark.
//Pass that input to the passorfail function and let the function decide whether student is passorfail
import java.util.Scanner;
class School{
    void passorfail(int n)
    {
        if( n>=35)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter your total mark for 100:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        School obj1=new School();
        obj1.passorfail(n);

    }
}