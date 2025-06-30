public class TrieinJava{
   static class Node{               // create a node for trie 
        Node[] child = new Node[26];  // no. of child node is 26 becauase alphabets has 26 
        Boolean eow = false;          // end of words 

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
 // search any string in trie 
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
    public static void main(String[] args) {                                                // trie is important data structure its used to string data store like tree like structure 
                                                                                            // its not repreated string characater
        String words[] ={"the" ,"a","there","their","any","thee"};
        // insert in trie 
        for(int i=0;i<words.length;i++){
          insertTrie(words[i]);       
           
        }

       System.out.println(SearchInTrie("thee")); //O(L)    // L is length of words
        System.out.println(SearchInTrie("thor"));  







        
    }

}
