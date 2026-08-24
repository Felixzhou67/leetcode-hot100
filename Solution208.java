/*
ClassName:Solution208
@Author Zhou
@Create 2026/8/18 19:28
*/
public class Solution208 {
    class Trie {

        private static class TrieNode {
            TrieNode[] children = new TrieNode[26];
            boolean isEnd;
        }

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode cur=root;
            for(char a:word.toCharArray())
            {
                int index=a-'a';
                if(cur.children[index]==null)
                {
                    cur.children[index]=new TrieNode();
                }
                cur=cur.children[index];
            }
            cur.isEnd=true;
        }

        public boolean search(String word) {
            TrieNode cur=root;
            for(char a:word.toCharArray()) {
                int index=a-'a';
                if(cur.children[index]==null)
                {
                    return false;
                }
                cur=cur.children[index];
            }
            return cur.isEnd;
        }

        public boolean startsWith(String prefix) {
            TrieNode cur=root;
            for(char a:prefix.toCharArray()) {
                int index=a-'a';
                if(cur.children[index]==null)
                {
                    return false;
                }
                cur=cur.children[index];
            }
            return true;
        }
    }
}
