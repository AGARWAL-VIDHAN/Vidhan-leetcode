class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        String[] arr1 = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char letter = words[i].charAt(j);
                arr1[i] += arr[letter-'a'];
            }
        }
        HashSet<String> uniqueElements = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            uniqueElements.add(arr1[i]);
        }
        return uniqueElements.size();
    }
}