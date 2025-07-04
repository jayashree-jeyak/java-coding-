class arm{
    public static void main(String[] args) {
      int num=153;
      int count=0;
      int num1=num;
      while(num1>0){
        int digit=num1%10;
        count++;
        num1=num1/10;
      }  
      int temp=num;
      //int check=num;
      double sum=0;
      while(temp>0){
        int val=temp%10;
        sum=sum+Math.pow(val,count);
        temp=temp/10;
      }
      if(num==sum){
      System.out.println("yes armstrong");
      }
      else{
        System.out.println("no");
      }
    }
}