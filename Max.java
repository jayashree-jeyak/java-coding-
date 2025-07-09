//maximum subarray
class max{
    public static void main(String [] args){
        int[] num={1,3,4,5,6,3};
        int max=num[0];
        int maxnow=num[0];
        for(int i=0;i<num.length;i++){
            max=Math.max(num[i],max+num[i]);
            maxnow=Math.max(maxnow,max);
        }
        System.out.println(maxnow);
    }
}