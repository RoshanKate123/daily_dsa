public class HashTable2{
	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;
	
	public HashTable2(int capacity){
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[capacity];
		this.size = 0;
	}
	
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key , String value){
			this.key = key;
			this.value = value;
		}
	}
	public int size(){
		return size;
	}
	
	public
	public static void main(String args[]){
		HashTable2 table = new HashTable2(10);
	}
}