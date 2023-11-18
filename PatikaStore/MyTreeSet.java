package PatikaStore;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet<T extends StoreObject> extends TreeSet<T>{
    public T getElement(int id) {
        Iterator<T> i = this.iterator();
        while (i.hasNext() ) {
            T element = i.next();
            if (element.getId() == id){
                return element;
            }
        }
        return null;
    }
    public void removeElement(int id){
        T element = this.getElement(id);
        if(element != null){
            this.remove(element);
        }
    }
    @Override
    public Comparator<? super T> comparator() {
        return new Comparator<T>() {
            @Override
            public int compare(T arg0, T arg1) {
                // TODO Auto-generated method stub
                return Integer.compare(arg0.getId(),arg1.getId());
            }
        };
    }
}
