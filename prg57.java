/*57. Second largest number in an array
Input:[12, 35, 1, 10, 34, 1]
Output:34*/
class prg57{
    public static void main(String[] args) {
        int[] arr={12,35,1,10,34,1};
        int first=-1;
        int second=-1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>first){
            second=first;
            first=arr[i];
           }
           else if (arr[i]>second && arr[i]!=first){
            second=arr[i];
           }
        }
        System.out.println(second);
    }
}