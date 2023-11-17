 
 
 class BottonUpReHeeapify{
	private Integer[] heap;
	private int n;
	
	public BottonUpReHeeapify(int capacity){
		heap = new Integer[capacity+1];
		n = 0;
	}
	public boolean isEmpty(){
		return n==0;
	}
	
	public int size(){
		return n;
	}
	public void insert(int x){
		if(n==heap.length-1){
			resize(2*heap.length);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	
    public void swim(int k){
		while(k>1&& heap[k/1]<heap[k]){
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k=k/2;
    }
	}
	public void resize(int capacity){
		Integer[] temp = new Integer[capacity];
		for(int i =0;i<heap.length;i++){
			temp[i]=heap[i];
		}
		heap = temp;
		
	}
	public void printMaxHeap(){
		for(int i=0;i<=n;i++){
			System.out.println(heap[i]+" ");
		}
	}
	public static void main(String args[]){
		BottonUpReHeeapify btr = new BottonUpReHeeapify(3);
		btr.insert(4);
		btr.insert(5);
		btr.insert(2);
		btr.insert(6);
		btr.insert(1);
		btr.insert(3);
		System.out.println(btr.size());
		btr.printMaxHeap();
	}
}

	