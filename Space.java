class Space{
    public static void main(String[] args) {
        String s1=" hi hello    there   how    are  you";
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=''){
                s2=s2+s1.charAt(i);
            }
            else if(s1.charAt(i)==' ' && s1.charAt(i+1))
        }