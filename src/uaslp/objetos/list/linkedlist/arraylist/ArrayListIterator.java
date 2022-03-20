package uaslp.objetos.list.linkedlist.arraylist;

import uaslp.objetos.list.linkedlist.Iterator;

public class ArrayListIterator implements Iterator {

    private ArrayList arrayList;
    private int currentItem = 0;

    public ArrayListIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }
@Override
    public boolean hasNext() {
        return currentItem < arrayList.getSize();

    }


    public String next()
    {
        String data= arrayList.getAt(currentItem);
        currentItem++;
        return data;


    }
}
