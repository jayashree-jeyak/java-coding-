/*9. Remove all duplicates in an array sample input and output
Input:[1, 2, 2, 3, 4, 4, 5]
Output:[1, 2, 3, 4, 5]*/
class prg59{
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};
        int n=arr.length;
        int[] temp=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            boolean isduplicate=false;
            for(int j=0;j<k;j++){
                if(arr[i]==temp[j]){
                   isduplicate=true;
                   break;
                }
            }
                if(!isduplicate){
                    temp[k]=arr[i];
                    k++;
                }
            
        }
        System.out.print("[");
        for(int i=0;i<k;i++){
            System.out.print(temp[i]);
            if(i<k-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}