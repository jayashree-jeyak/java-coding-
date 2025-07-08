//merged array and sum;
class eight{
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={3,4,5,7};
        int high=(a.length>b.length)?a.length:b.length;
        int[] c=new int[high];
        //int max=a.length+b.length;
        for(int i=0;i<high;i++){
            int num1=(i<a.length)? a[i]:0;
            int num2=(i<b.length)? b[i]:0;
            c[i]=num1+num2;
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+ " ");
        }
    }
}