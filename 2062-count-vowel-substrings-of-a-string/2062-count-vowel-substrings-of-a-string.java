class Solution {
    public int countVowelSubstrings(String word) {
        if (word.length() < 5) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int ans=0;
        int[] freq=new int[26];
        while (i < word.length()) {
            if ( j==word.length()|| (word.charAt(j) != 'a' && word.charAt(j) != 'e' && word.charAt(j) != 'i' && word.charAt(j) != 'o' && word.charAt(j) != 'u')){
                i++;
                j=i;
                freq=new int[26];
                continue; 
            }
            freq[word.charAt(j)-'a']++;
            if(freq['a'-'a']>0 && freq['e'-'a']>0 && freq['i'-'a']>0 && freq['o'-'a']>0 && freq['u'-'a']>0){
                ans++;
            }
            j++;
        }
        return ans;
    }
}