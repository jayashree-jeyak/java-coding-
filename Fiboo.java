class fiboo{
    public static void main(String[] args){
        int n=7;
        int fir=0;
        int sec=1;
        int third=0;
        System.out.print(fir+" ");
        System.out.print(sec+ " ");
        for(int i=1;i<n;i++){
            third=fir+sec;
            System.out.print(third+" ");
            fir=sec;
            sec=third;
            
                   }
                  // System.out.println(third);
    }
}