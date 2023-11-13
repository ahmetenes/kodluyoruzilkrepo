public interface IMyList<T> {
    abstract int size() ;

    abstract int getCapacity() ;

    abstract void add(T data) ;

    abstract T get(int index);

    abstract void remove(int index);

    abstract void set(int index, T data) ;

    abstract String toString() ;

    abstract int indexOf(T data) ;

    abstract int lastIndexOf(T data) ;

    abstract boolean isEmpty() ;

    abstract T[] toArray() ;

    abstract void clear() ;

    abstract boolean contains(T data) ;
}
