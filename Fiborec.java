class fiborec{
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String [] args){
        int result=fibo(2);
        System.out.println(result);

    }
}