class Solution {
    public boolean detectCapitalUse(String word) {
        
        int wordcount=0;
        for(int i=0; i<word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i))){
                wordcount++;
            }
        }

        return wordcount==word.length() || wordcount==0 || (wordcount==1 && Character.isUpperCase(word.charAt(0)));
    }
}