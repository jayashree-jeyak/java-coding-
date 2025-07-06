class merge{
    public static void main(String[] args){
    int[] a  ={1,4,5,6};
    int[] b={5,6,7,8};
    int[] c=new int[a.length+b.length];
    int i=0;int j=0;int k=0;
    while(i<a.length && j<b.length){
        if(a[i] < b[j]){
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
    for(int x=0;x<c.length;x++){
        System.out.print(c[x]+" ");
    }
}
}