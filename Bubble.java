class Bubble{
    public static void main(String[] args) {
        int[] arr={1,2,5,8,9,5};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp=arr[j];
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num);
        }
    }
    }
