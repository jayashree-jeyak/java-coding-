class anagram{
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
        }
        int[] count=new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                System.out.println("not anagarm");
                return;
            }
        }
                System.out.println("is anagram");
            
        }
    }
