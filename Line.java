class line{
    public static void main(String[] args) {
        int[] arr={1,4,5,6,7,8,9};
        int target=6;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print("the elemnt " + target +"is found at position" +i);
                return;
            }
        
        
        }
        if (!found){
            System.out.println("not in the array");
        }
    }
}