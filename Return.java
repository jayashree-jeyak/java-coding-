//here i have created the func and then used return keyword
class Return{
    int getsum(int n1,int n2){
    
    int sum=n1+n2;
    return sum;
}
    public static void main(String[] args) {
        Return obj1=new Return();
        int add=obj1.getsum(9,10);
        System.out.println(add);
        
    }
}
