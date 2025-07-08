class sev{
    public static void main(String[] args) {
        String str=" I Love virtusa";
        String[] words=str.split(" ");
        String rev=" ";
        for(int i=words.length-1;i>=0;i--){
           
            System.out.print(words[i]+" ");
       }
       
    }
}