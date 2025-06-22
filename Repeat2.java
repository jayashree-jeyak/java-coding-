
class Repeat2{
    public static void main(String[] args) {
        String  s1="prasanna";
        s1=s1.toLowerCase();
        for(int i=0;i<s1.length();i++){
            char fir=s1.charAt(i);
        
        for(int j=i+1;j<s1.length();j++){
            if(fir!=s1.charAt(j)){
                System.out.println(fir);
                System.out.println(i);
               return;
            }
        }

    }
}
}