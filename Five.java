class five{
    public static void main(String[]args){
        String str=" hi girls im jayashree ";
        int[] freq= new int[26];
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' ){
                freq[ch-'a']=1;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                System.out.println("not a pangram");
                return;
            }

        }
        System.out.println("yes ");

    }
}