class three{
    public static void main(String[] args) {
        int[] a={1,3,4,5,2};
        int[] b={4,5,6,7,3};
        int[] c=new int[a.length+b.length];
        int i=0;int j=0;int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        for(int x=0;x<c.length;x++)
        System.out.print(c[x]+ " ");
    }
}