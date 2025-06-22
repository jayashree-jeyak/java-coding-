class word{
    public static void main(String[] args) {
        String s="i am raja and muthu here";
        int space1=0;
        int count=0;
        int count1=0;
        char[] c1=s.toCharArray();
        for(int i=0;i<c1.length;i++){
            if(s.charAt(i)==' '){
                space1++;
            }
            if(s.charAt(i)!=' '){
                count++;
            }
            if(i<c1.length-1){
            if((s.charAt(i)!=' ' && s.charAt(i+1)==' ')||s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count1++;
            }
            }
        }
        System.out.println(space1);
        System.out.println(count);
        System.out.println((count1/2)+1);
    }
}