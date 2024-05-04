 public String reverseVowels(String s) {
        char[] words = s.toCharArray();
        int i = 0, j = s.length()-1;
        Set<Character> set = Set.of('a','e','i','o','u','A','E','I','O','U');

        while(i < j) {
            while(i < j && !set.contains(words[i])) {
                i++;
            }
            while(i < j && !set.contains(words[j])) {
                j--;
            }
            helper(words, i, j);
            i++;
            j--;
        }
        return new String(words);
    }

    private void helper(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
