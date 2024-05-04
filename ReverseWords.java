class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        List<String> reverseWordsList = new ArrayList<>();

        for(int i = wordsList.size()-1; i>=0; i--)
        {
            reverseWordsList.add(wordsList.get(i));
        }

        StringBuilder sb = new StringBuilder();

        for(String word: reverseWordsList)
        {
            sb.append(word).append(" ");
        }

        return sb.toString().trim();
    }
}
