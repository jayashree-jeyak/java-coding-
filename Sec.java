class sec{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,3,5,5,4,5};
        int fir=-1;
        int sec=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fir){
                 sec=fir;
                fir=arr[i];
               
            }
            else if(arr[i]>sec && arr[i]!=fir){
                sec=arr[i];
            }
        }
        System.out.println(sec);
    }
}