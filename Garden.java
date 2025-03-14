class Garden{
    void total_money()
    {
        int apple_price=20;
        int apple_count=5;
        System.out.println(apple_price*apple_count);
    }
    public static void main(String[] args) {
        Garden obj1=new Garden();
        obj1.total_money();
    }
}