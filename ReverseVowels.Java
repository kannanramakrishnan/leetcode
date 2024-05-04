class ReverseVowels {
    public String reverseVowels(String s) {
        char[] words = s.toCharArray();
        int i = 0; 
        int j = words.length-1;
        Set<Character> set = Set.of('A','E','I','O','U','a','e','i','o','u');

        while(i<j)
        {
            while(i<j && !set.contains(words[i]))
            {
                i++;
            }

            while(i<j && !set.contains(words[j]))
            {
                j--;
            }

            helper(words, i, j);
            i++;
            j--;
        }

        return new String(words);
    }

    private void helper(char[] words, int i, int j)
    {
        char temp = words[i];
        words[i] = words[j];
        words[j] = temp;
    }
}
