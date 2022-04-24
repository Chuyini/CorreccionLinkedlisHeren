package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.linkedlist.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.linkedlist.exception.NotValidIndexException;

public interface  List <T> {

    void addAtTail(T data) throws NotNullValuesAllowedException;
    void addAtFront(T data) throws NotNullValuesAllowedException;
    void remove(int index) throws NotValidIndexException;
    void removeAll();
    void setAt(int index,T data) throws NotValidIndexException, NotNullValuesAllowedException;
    T getAt(int index);
    Iterator<T> getIterator();
    int getSize();

}
