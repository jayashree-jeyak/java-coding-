// in this program i have learned how to use function and how to call them without creating objcet
//static func cant call non static func so we have made everything static
class Mobile{
    static void Iphone()
    {
       System.out.println("this is Iphone");
    }
    static void Samsung()
    {
       System.out.println("this is Samsung");
    }
    static void Realme()
    {
       System.out.println("this is Realme");
    }
    static void Oppo()
    {
       System.out.println("this is Oppo");
    }
    static void Vivo()
    {
       System.out.println("this is Vivo");
    }
    public static void main(String[] args) {
        Samsung();
        Iphone();
        Oppo();
        Vivo();
        Realme();
        
    }
}