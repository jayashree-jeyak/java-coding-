class sum{
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        int eve=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                eve=eve+arr[i];
            }
            else{
                odd=odd+arr[i];
            }
        }
        System.out.println(  eve );
        System.out.println(odd);
    }
}