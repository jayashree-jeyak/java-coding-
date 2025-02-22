import java.util.Random;
class Genrandom{
    public static void main(String[] args) {
        int num = 0;
        Random rand= new Random();
        //int num=rand.nextInt(100);
        while(num != 5){
             num=rand.nextInt(100);
            System.out.println(num);
        }
    }
}