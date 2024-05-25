class SearchSuggestion {
    class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<>();
        PriorityQueue<String> words = new PriorityQueue<>(3, (a, b) -> b.compareTo(a));
    }

    private void insert(TrieNode root, String word) {
        for (char c : word.toCharArray()) {
            if (!root.children.containsKey(c)) {
                root.children.put(c, new TrieNode());
            }
            root = root.children.get(c);
            if (root.words.size() < 3) {
                root.words.offer(word);
            } else {
                String top = root.words.peek();
                if (top.compareTo(word) > 0) {
                    root.words.poll();
                    root.words.offer(word);
                }
            }
        }
    }

    private List<List<String>> searchPrefix(TrieNode root, String word) {
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            result.add(new ArrayList<>());
        }
        int i = 0;
        for (char c : word.toCharArray()) {
            List<String> words = result.get(i++);
            if(root.children.containsKey(c)){
                root = root.children.get(c);
                while(!root.words.isEmpty()){
                    words.addFirst(root.words.poll());
                }
            }
            else{
                return result;
            }
        }
        return result;
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Set<String> words = new HashSet<>();
        for(String s : products){
            words.add(s);
        }
        TrieNode root = new TrieNode();
        for(String s : words){
            insert(root, s);
        }
        return searchPrefix(root, searchWord);
    }
}
