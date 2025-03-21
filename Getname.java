//create a func called getname which should return your name
class Getname{
    String getname(){
        return("jayashree");
    }
    public static void main(String[] args) {
        Getname obj1=new Getname();
       String name= obj1.getname();
       System.out.println(name);

    }
}