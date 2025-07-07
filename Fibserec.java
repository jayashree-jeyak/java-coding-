class fibserec{
    public static int fir(int n){
        if(n<=1){
            return n;
        }
        else{
            return fir(n-1)+fir(n-2);
        }
    }
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n;i++){
            System.out.print(fir(i) + " ");
        }
    }
}