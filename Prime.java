class prime{
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if(count!=0){
            System.out.println("not a prime num");
        }
        else{
            System.out.println("a prime num");
        }
    }
}