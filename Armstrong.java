import java.util.Scanner;
    class Armstrong{
        public static void main(String[] args) {
            int sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.print("enter a number: ");
            int a=sc.nextInt();
            int temp=a;
            while(a>0){
                int n=a%10;
                int n1=n*n*n;
                sum=sum+n1;
                a=a/10;
            }
            //jSystem.out.println(sum);
            if(temp==sum){
                System.out.println("is a armstrong num");
            }
            else{
                System.out.println("not a armstrong num");
            }
        }
    }
