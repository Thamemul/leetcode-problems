class Solution {
    public int wordCount(String str) {
        int count = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==' '){
            count++; 
            }
        }
        return count+1;
    }
    public int mostWordsFound(String[] sentence) {
        int maxWord =0;
        for(int i=0;i<sentence.length;i++){
            int count = wordCount(sentence[i]);
            if(count>maxWord){
                maxWord = count;
            }
        }
        return maxWord;
    }
}