/*58. Re-arranged array by small – largest combination
Input: [1, 3, 5, 2, 8, 7, 4]
Output:[1, 8, 2, 7, 3, 5, 4]*/
class prg58{
    public static void main(String[] args) {
        int[] arr={1,3,5,2,8,7,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
            int[] res=new int[n];
            int left=0;
            int right=n-1;
            int index=0;
            while(left<=right){
                if(index<n){
                    res[index]=arr[left];
                    left++;
                    index++;
                }
                if(index<n){
                    res[index]=arr[right];
                    right--;
                    index++;
                }
            }
            System.out.print("[");
            for(int k=0;k<n;k++){
                System.out.print(res[k]);
               if (k!= n - 1) System.out.print(", ");
            }
            System.out.print("]");
        
    }
}