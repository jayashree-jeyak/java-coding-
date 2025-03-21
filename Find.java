//• Create a class called "Find" with main function 
//• Create a function called evenorodd with integer parameter called int num
//• Inside Main function get integer input from user.
//• Pass that input to the evenorodd function andlet the function decide whether the number is even or odd
import java.util.Scanner;
class Find{
    void evenorodd(int num){
    if(num%2==0){
        System.out.println("even");
    }
    else{
       System.out.println("odd"); 
    }
    
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        Find obj1=new Find();
         obj1.evenorodd(num);
        //System.out.println(numb);

        
    }
}