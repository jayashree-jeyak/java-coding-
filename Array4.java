class Array{
    public static void main(String[] args) {
        
        //int biggest=a1[0];
       
        int a1[]={33,44,55,66};
        int smallest=a1[0];
        int biggest=a1[0];
        for(int i=0;i<a1.length;i++){
         
         
           int num=a1[i];
         if(num>smallest){
            smallest=num;
         }
         
             //System.out.println(smallest);   
             int n1=a1[i];    
          if(n1<biggest){
            n1=biggest;
          }     
        }
       
         System.out.println(smallest); 
         System.out.println(biggest);
    }
}
