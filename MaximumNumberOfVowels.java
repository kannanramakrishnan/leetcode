class MaximumNumberOfVowels {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int currentCount = 0; 
        int maxCount = 0;
        for(int i=0; i<s.length(); i++)
        {
           if(vowels.indexOf(s.charAt(i)) >= 0)
           currentCount++;

           if(i>=k && vowels.indexOf(s.charAt(i-k))>=0)
           currentCount--;

           maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}
