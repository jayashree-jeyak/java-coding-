//print the numbers which are divisible by both 3 and 5 within the range of 1 to 100
class Forloop9{
    public static void main(String[]args){
        for(int i=1;i<=100;i++){
           if(i%3==0 && i%5==0){
            System.out.println(i);
           } 
        }
    }
}