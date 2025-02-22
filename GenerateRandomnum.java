import java.util.Random;
class GenerateRandomnum{
    public static void main(String[]args){
        Random rand = new Random();
        int num = rand.nextInt(500);
        System.out.println(num);
    }
}