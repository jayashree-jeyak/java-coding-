//get the input size of array
// get input for each element in array
import java.util.Scanner;
import java.util.Arrays;
class Array4{
    public static void main (String [] args){
       System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[] array=new int[a];
        System.out.println("enter the input:");
        
       for(int i=0;i<a;i++){
        array[i]=sc.nextInt();
        
       }
       //System.out.println("the entered array is:"+Arrays.to string(Array));
       System.out.println("The entered array is: " + Arrays.toString(array));
        int c = a / 2;
    if(a % 2 == 0){
        System.out.println("mid is " + array[c-1]);
    }
    else{
        System.out.println("mid is " + array[c]);

    }
   
    }
}