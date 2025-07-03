
//5.	Character Frequency Count in a String
//→ Input: "success" → Output: s:3, u:1, c:2, e:1

class stringnum{
    public static void main(String[] args) {
        String s1="alalamalalalkji";
        s1=s1.toLowerCase();
        int[] count=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch>='a' && ch<='z'){
                count[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+ "--" +count[i]);
            }
        }
    }
}