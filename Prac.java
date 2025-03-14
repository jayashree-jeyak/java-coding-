//in this program i have made use of function with parameters and by creating obj also
class Prac{
    void sum(int n1,int n2){
       System.out.println(n1+n2);
    }
    void sub(int n3,int n4){
        System.out.println(n3-n4);
    }
    public static void main(String[] args) {
        //create obj then call
        Prac obj1=new Prac();
        obj1.sum(20,30);
        obj1.sub(50,30);
    }
}