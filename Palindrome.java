class Palindrome{
    public static void main(String[]args){
        int n=151;
        int temp=n;
        int rev=0;
        while(n>0){
            int n1=n%10;
            rev=rev*10+n1;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("is palindrome");

        }
        else{
            System.out.println("not a palindrome");
        }

    }
}