class Lar{
    public static void main(String[] args) {
        int[] arr={5,6,8,9,4,10};
        int n=arr.length;
        int first=-1;
        int second=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}