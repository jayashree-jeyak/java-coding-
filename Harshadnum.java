//harshad num which is also known niven numbers A number divisible by the sum of its digits.
//Example: 18 → 1 + 8 = 9 → 18 % 9 = 0
class Harshadnum{
    public static void main(String[] args) {
        int num=19;
        int sum=0;
        int temp=19;
        while(num>0){
            int n=num%10;
            sum=sum+n;
            num=num/10;
        }
        if(temp%sum==0){
            System.out.println("is a harshad num");
        }
        else{
            System.out.println("not a harshad num");
        }
    }
}