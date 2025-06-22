class pat4{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<2*n;i++){
            int total=(i>n)? 2*n-i:i;
            int spaces=(i>n)? i-total: n-total;
            for(int s=1;s<=spaces;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=total;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}