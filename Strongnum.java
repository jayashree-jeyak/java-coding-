//A Strong Number is a number where the sum of the factorials of its digits equals the number itself.
//Example: 145
//1! = 1
//4! = 4 × 3 × 2 × 1 = 24
//5! = 5 × 4 × 3 × 2 × 1 = 120
// Sum = 1 + 24 + 120 = 145 
//So, 145 is a Strong Number.
class Strongnum{
    public static void main(String[] args) {
        int num=123;
        int temp=num;
        int sum=0;
        while(num>0){
            int n1=num%10;
            int fact=1;
            for(int i=1;i<=n1;i++){
                 fact=fact*i;
            }
            sum = fact + sum;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("is strong");
        }
        else{
            System.out.println("not strong");
        }
    }

}