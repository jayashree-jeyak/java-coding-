class two{
    public static void main(String[] args) {
        int n=10;
        
        for(int i=1;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<Math.sqrt(n);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
                
                }
                if (isprime){
                    System.out.println(i);
            }

        }
    }
}