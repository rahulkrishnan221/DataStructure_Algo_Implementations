class TrieNode
{
	int ALPHA_SIZE=26;
	TrieNode children[]=new TrieNode[ALPHA_SIZE];
	boolean isEndofWord;

	TrieNode()
	{
		isEndofWord=false;
		for(int i=0;i<ALPHA_SIZE;i++)
		{
			children[i]=null;
		}
	}


}
class Trie
{
	TrieNode root;
void insert(String key)
{
	TrieNode crawler=root;
	for(int level=0;level<key.length();level++)
	{
		int index=key.charAt(level)-'a';
		if(crawler.children[index]==null)
			crawler.children[index]=new TrieNode();
		crawler=crawler.children[index];

	}
	crawler.isEndofWord=true;

}
boolean search(String key)
{
	TrieNode crawler=root;
	for (int level=0;level<key.length();level++ ) {
		int index=key.charAt(level)-'a';
		if(crawler.children[index]==null)
			return false;
		crawler=crawler.children[index];
	}
	return (crawler!=null && crawler.isEndofWord);

}

public static void main(String[] args) {
	
	Trie trie=new Trie();
	trie.root=new TrieNode();
	trie.insert("hello");
	trie.insert("world");
	System.out.println(trie.search("hello"));
	System.out.println(trie.search("worl"));
}
}