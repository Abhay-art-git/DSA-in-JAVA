public class WordBreakProblem {
  static class Node{
        Node[] child = new Node[26];
        Boolean eow = false;

     Node() {
              for (int i = 0; i < 26; i++) {
                child[i] = null;              
              }
        }
    }

      public static Node root = new Node();
       // insert in trie
      public static void insertTrie(String word){   //O(L)   
           Node curr = root;
      for(int lvl=0;lvl<word.length();lvl++){
             int idx = word.charAt(lvl)-'a';
          if(curr.child[idx]==null){
              curr.child[idx] = new Node();
            }
          curr = curr.child[idx];
       }
           curr.eow = true;
      }

      public static boolean SearchInTrie(String key){
         Node curr = root;
      for(int lvl=0;lvl<key.length();lvl++){
             int idx = key.charAt(lvl)-'a';
          if(curr.child[idx]==null){
              return false;
            }
          curr = curr.child[idx];
       }
           return curr.eow == true;
      }

  public static boolean wordbreak( String key){
    if(key.length()==0){
      return true;
    }
    for(int i=0;i<key.length();i++){
      if(SearchInTrie(key.substring(0,1))&& wordbreak(key.substring(i))){
        return true;
      }

    }
    return false;

  }
    //@google interviews
      public static void main(String[] args) {
        String words[] ={"the" ,"a","there","their","any","thee"};
        // insert in trie 
        for(int i=0;i<words.length;i++){
          insertTrie(words[i]);
           
        }

          
      }
    
}
