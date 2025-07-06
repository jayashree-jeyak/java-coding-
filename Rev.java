class rev{
    public static int rev(int n,int rev){
        if(n==0){
            return rev;
        }
        else{
            int lastdigit=n%10;
             rev=rev*10+lastdigit;
            return rev (n/10,rev);
        }
    }
    public static void main(String[] args) {
        int res=rev(5678,0);
        System.out.println(res);
    }
}