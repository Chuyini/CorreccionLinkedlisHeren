package uaslp.objetos.list.linkedlist.arraylist;

import uaslp.objetos.list.linkedlist.Iterator;

public class ArrayListIterator<T> implements Iterator<T> {

    private ArrayList <T> arrayList;
    private int currentItem = 0;

    public ArrayListIterator(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }
@Override
    public boolean hasNext() {
        return currentItem < arrayList.getSize();

    }


    public T next()
    {
        T data=  arrayList.getAt(currentItem);
        currentItem++;
        return data;


    }
}
