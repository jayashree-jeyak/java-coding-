/* Missing number in an array of shuffled order
Input:[3, 7, 1, 2, 8, 4, 5]
Output:6
*/
class prg56{
    public static void main(String[] args) {
        int[] arr={3,7,2,1,8,4,5};
        int sum=0;
        int n=arr.length+1;
        int total=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        }
        int missing=total-sum;
       System.out.println(missing);
    }
}