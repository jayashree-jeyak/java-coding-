//to find the sum of the digits of a given number
class Sod{
    public static void main(String[] args) {
        int n=12345;
        
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
             n=n/10;
        }
        System.out.println(sum);
    }
}