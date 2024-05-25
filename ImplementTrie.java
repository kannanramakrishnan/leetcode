class Trie {

  TrieNode root = new TrieNode();

  public Trie() {}

  public void insert(String word) {
    TrieNode cur = root;
    for (char c : word.toCharArray()) {
      int idx = c - 'a';
      if (cur.children[idx] == null) cur.children[idx] = new TrieNode();
      cur = cur.children[idx];
    }
    cur.isEnd = true;
  }

  public boolean search(String word) {
    return helper(word, false);
  }

  public boolean startsWith(String prefix) {
    return helper(prefix, true);
  }

  public boolean helper(String word, boolean forPrefix) {
    TrieNode cur = root;
    for (char c : word.toCharArray()) {
      int idx = c - 'a';
      if (cur.children[idx] == null) return false;
      cur = cur.children[idx];
    }
    return forPrefix || cur.isEnd;
  }
}

class TrieNode {

  TrieNode[] children = new TrieNode[26];
  boolean isEnd = false;
}
