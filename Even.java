class Even{
    public static void main(String[] args){
        int[] arr={2,4,6,10};
        int n=arr.length+1;
        int total=n * (n+1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int miss=total-sum;
        System.out.print(miss);
    }
}