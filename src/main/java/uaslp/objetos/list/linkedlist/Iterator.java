package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.linkedlist.exception.NotValidIndexException;

public interface Iterator <T>{

    boolean hasNext();
    T next() throws NotValidIndexException;

}
