
public class MyList<T> implements IMyList<T>{
    private int capacity;
    private int recordSize;
    private Object[] records;

    public MyList() {
        this.setRecords(new Object[10]);
        this.setCapacity(10);
        this.setRecordSize(0);
    }

    public MyList(int capacity) {
        this.setCapacity(capacity);
        this.setRecords(new Object[capacity]);
        this.setRecordSize(0);

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRecordSize() {
        return recordSize;
    }

    public void setRecordSize(int recordSize) {
        this.recordSize = recordSize;
    }

    public Object[] getRecords() {
        return records;
    }

    public void setRecords(Object[] records) {
        this.records = records;
    }

    
    public int size() {
        return this.recordSize;
    }

    
    public int getCapacity() {
        return this.capacity;
    }

    
    public void add(T data) {
        if (this.getCapacity() == this.getRecordSize()) {
            this.setCapacity(this.getCapacity() * 2);
            Object[] array = new Object[this.getCapacity()];
            for (int i = 0; i < this.getRecordSize(); i++) {
                array[i] = this.get(i);
            }
            this.setRecords(array);
        }
        this.getRecords()[this.getRecordSize()] = data;
        this.setRecordSize(this.getRecordSize() + 1);
    }

    
    public T get(int index) {
        if (index < this.getRecordSize())
            return (T) this.getRecords()[index];
        return null;
    }

    
    public void remove(int index) {
        if (index < this.getRecordSize()) {
            for (int i = index; i < this.getRecordSize(); i++) {
                this.getRecords()[i] = this.get(i + 1);
            }
            this.setRecordSize(this.getRecordSize() - 1);
        }
    }

    
    public void set(int index, T data) {
        if (this.getRecordSize() < index - 1)
            this.getRecords()[index] = data;
        this.get(index);
    }

    
    public int indexOf(T data) {
        for (int i = 0; i < this.getRecordSize(); i++) {
            if (this.get(i) == data) {
                return i;
            }
        }
        return -1;
    }

    
    public int lastIndexOf(T data) {
        int last = -1;
        for (int i = 0; i < this.getRecordSize(); i++) {
            if (this.get(i) == data) {
                last = i;
            }
        }
        return last;
    }

    
    public boolean isEmpty() {
        return this.recordSize == 0;
    }

    
    public T[] toArray() {
        Object[] array = new Object[this.recordSize];
        for (int i = 0; i < this.getRecordSize(); i++) {
            array[i] = this.get(i);
        }
        return (T[]) array;
    }

    
    public void clear() {
        this.setRecordSize(0);
    }

    @Override
    public String toString() {
        // [100,20,40]
        String s = "[";
        for (int i = 0; i < this.getRecordSize(); i++) {
            s += this.get(i).toString();
            s+= i==this.getRecordSize()-1? "":",";
        }
        return s+"]";
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> myList = new MyList<T>();
        for (int i = start; i <= finish && i < this.getRecordSize(); i++) {
            myList.add(this.get(i));
        }
        return myList;
    }

    public boolean contains(T data) {
        return this.indexOf(data) != -1;
    }

}
