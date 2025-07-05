class factr{
       
    public static int fact(int n){
        if(n<1){
            return 1;
        }
       int res = n*fact(n-1);
       return res;
    }
    public static void main(String[] args) {
        int ans=fact(5);
        System.out.println(ans);

    }
}