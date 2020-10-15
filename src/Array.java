public class Array {

    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //向所有元素后添加一个新元素
    public void addLast(int e){
        this.add(size,e);
    }

    //在数组头添加一个元素
    public void addFirst(int e){
        this.add(0,e);
    }

    //在index位置插入e元素
    public void add(int index,int e){
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Array is full.");
        }

        if (index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index < size.");
        }

        for (int i=size-1 ; i>=index ; i--){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    //获取index索引元素
    public int get(int index){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        return data[index];
    }

    //修改index位置元素为e
    public void set(int index,int e){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Set failed.Index is illegal.");
        }
        data[index] = e;
    }


    //查找e元素是否被数组包含
    public boolean contains(int e){
        for (int i=0 ; i<size ; i++){
            if (data[i] == e){
                return true;
            }
        }
        return false;
    }

    //查找元素e在数组中是否存在，并返回索引。如不存在则返回特殊索引-1。
    public int find(int e){
        for (int i=0 ; i<size ; i++){
            if (data[i] == e){
                return i;
            }
        }
        return -1;
    }

    //从数组中删除index位置元素，返回删除的元素
    public int remove(int index){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Delete failed.Index is illegal.");
        }
        int ret = data[index];

        for (int i=index ; i<size ; i++){
            data[i] = data[i+1];
        }
        size--;
        return ret;
    }

    //从数组中删除第一个元素，并返回删除的元素
    public int removeFirst(){
        return remove(0);
    }

    //从数组中删除最后一个元素，并返回删除的元素
    public int reomoveLast(){
        return remove(size-1);
    }

    //从数组中删除指定元素,并返回删除的元素个数
    public int removeElement(int e){
        int count = 0;
        int status = this.find(e);
        if (status!=-1) {
            for (int i = 0; i < size; i++) {
                if (e == data[i]) {
                    this.remove(i);
                    count++;
                }
            }
        }
        return count;
    }
    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity=%d\n",size,data.length));
        res.append('[');
        for (int i=0 ; i<size ; i++){
            res.append(data[i]);
            if (i != size-1 ){
                res.append(',');
            }
        }
        res.append(']');
        return res.toString();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
