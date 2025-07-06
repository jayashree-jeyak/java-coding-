class sumrec{
    public static int add(int n){
        if(n==0){
            return 0;
        }
       else{
        return (n%10)+add(n/10);
       }
    }
    public static void main(String[] args) {
        int result=add(567);
        System.out.println(result);
    }
}