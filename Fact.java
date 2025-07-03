class Fact{

    public static int fact(int n){
        if(n<1){
            return 1;
        }
        int res=n*fact(n-1);
        return res;
    }
    public static void main(String[] args){
        int result=fact(5);
        System.out.println(result);
    }
}