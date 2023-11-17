public class HashTable1{
	
	private HashNode[] buckets;
	private int size;
	private int numOfBuckets;
	
	//public HashTable1(){
	//	this(capacity: 10);
	
	//}
	public HashTable1(int capacity){
		this.numOfBuckets = capacity;
	this.buckets = new HashNode[numOfBuckets];
	this.size = 0;
	}
	
	
	class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
	
	public HashNode(Integer key, String value){
		this.key = key;
		this.value = value;
	}
	
	}
	
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public void put(Integer key , String value){
		if(key == null || value == null){
			return ;
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head!=null){
			if(head.key.equals(key)){
				head.value = value;
				return;
			}
			head = head.next;
			
		}
		size++;
		head = buckets[bucketIndex];
		HashNode node =  new HashNode(key,value);
		node.next = head;
        buckets[bucketIndex] = node;		
	}
	private int getBucketIndex(Integer key ){
		return key % numOfBuckets;
	}
	
	public String get(Integer key){
		if(key == null){
			return null;
		}
		int bucketIndex = getBucketIndex(key);
	HashNode head = buckets[bucketIndex];
	while(head!=null){
		if(head.key.equals(key)){
			return head.value;
		}
		head = head.next;
	}
		return null;
	}
	
	public String Remove(Integer key){
		if(key == null){
			return null ;
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		HashNode previous = null;
		
		while(head!=null){
			if(head.key.equals(key)){
				break;
			}
			previous = head ;
			head = head.next;
		}
		if(head == null){
			return null;
		}
		size--;
		if(previous!=null){
		previous.next = head.next;
		}else{
       buckets[bucketIndex] = head.next;
		}
return head.value;		
	}
	public static void main(String args[]){
		HashTable1 table = new HashTable1(10);
		table.put(105,"TOm");
		table.put(21,"Harry");
		table.put(31,"Dnesh");
		
		System.out.println(table.get(21));
		System.out.println(table.Remove(31));
		System.out.println(table.size());
	}
}