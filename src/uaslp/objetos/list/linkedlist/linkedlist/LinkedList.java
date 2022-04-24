package uaslp.objetos.list.linkedlist.linkedlist;
import uaslp.objetos.list.linkedlist.List;

import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.linkedlist.exception.NotValidIndexException;

public class LinkedList <T> implements List <T> {
    protected  Node <T> head;
    protected  Node <T>tail;
    public int size=0;
@Override
    public void addAtTail (T data) throws NotNullValuesAllowedException
    {
        if (data==null)
        {
            throw new NotNullValuesAllowedException();
        }
        if(head==null)
        {
            Node <T> til=new Node<>();
            head=tail=til;
            tail.nombre=data;
            size++;
        }else
        {
            Node <T>  aux= new Node<>();
            aux.nombre=data;
            aux.previous=tail;
            tail.next=aux;
            tail=aux;
            size++;
        }
    }
    @Override
    public void addAtFront(T data) throws NotNullValuesAllowedException
    {
        if (data==null)
        {
            throw new NotNullValuesAllowedException();
        }


        if(head==null)
        {
            Node<T> hed=new Node<>();
            tail=head=hed;
            head.nombre=data;

            size++;

        }else
        {
            Node <T>aux=new Node<>();
            aux.nombre=data;
            aux.next=head;
            head.previous=aux;
            head=aux;

            size++;
        }



    }
    @Override
    public void remove(int  index) throws NotValidIndexException {

        Node<T> aux =new Node<>();
        int cont;
        aux=head;
        if(index<0 || index>= size)
        {
            throw  new NotValidIndexException(index);
        }
        if(aux==null)
        {
            return;
        }

        for(cont=0;cont<index&&aux!=null;cont++,aux=aux.next) {

        }
        if (index == cont) {
            if (head == tail) {
                head = null;
                size--;
                return;


            }
            if(aux==tail)
            {
                tail=tail.previous;
                aux=null;
                size--;
                return;
            }
            if(aux==head)
            {
                head=head.next;
                aux=null;
                size--;
                return;
            }else
            {
                aux.next.previous= aux.previous;
                aux.previous.next=aux.next;
                size--;
                aux=null;

            }



        }
    }

    @Override
    public void removeAll()
    {
        Node aux=head;
        int cont;
        for (cont=0;cont<size;cont++)
        {
            aux=aux.next;
            aux.previous=null;

        }

    }
    @Override
    public void setAt(int index, T data) throws NotValidIndexException, NotNullValuesAllowedException
    {
        Node<T> aux= new Node<>();
        aux=head;
        int cont=0;
        if(head==null)
        {
            throw new NotNullValuesAllowedException();
        }
        if(index<0 || index>= size)
        {
            throw  new NotValidIndexException(index);
        }
        for (cont=0;cont<index;cont++)
        {

            aux=aux.next;

        }
        aux.nombre=data;



        return ;
        }





    @Override
    public T getAt(int index)
    {
        Node<T> aux=new Node<>();

        int cont;
        aux=head;


        for (cont=0;cont<=index;cont++,aux=aux.next)
        {
            if(cont==index)
            {
                return aux.nombre;
            }

        }
        return null;

    }



    public void removeAllWithVlue(T data)
    {

    }
    @Override
    public int getSize()
    {
        return size;

    }
    @Override
    public Iterator <T> getIterator()
    {
        Iterator iterator=  new LinkedListIterator<T>(head,size);

        return  iterator;
    }
}