package uaslp.objetos.list.linkedlist;

public class LinkedList {
    protected  Node head;
    protected  Node tail;
    public int size=0;
    protected int cont=0;

    public void addAtTail (String data)
    {


        if(head==null)
        {

            Node til=new Node();
            head=tail=til;
            tail.nombre=data;
            size++;

        }else
        {
            Node aux=new Node();
            aux.nombre=data;
            aux.previous=tail;
            tail.next=aux;
            tail=aux;
            size++;
        }



    }
    public void addAtFront(String data)
    {


        if(head==null)
        {
            Node hed=new Node();
            tail=head=hed;
            head.nombre=data;

            size++;

        }else
        {
            Node aux=new Node();
            aux.nombre=data;
            aux.next=head;
            head.previous=aux;
            head=aux;

            size++;
        }



    }
    public void remove(int index)
    {

        Node aux =new Node();
        int cont;
        aux=head;
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
    public void setAt(int index, String data)
    {
        Node nuevo=new Node();
        Node aux= new Node();
        aux=head;
        int cont;
        if(head==null)
        {
            return;
        }
        for (cont=0;cont<index;cont++)
        {

            aux=aux.next;

        }
        aux.nombre=data;



        return ;
        }






    public String getAt(int index)
    {
        Node aux=new Node();

        int cont;
        aux=head;

        for (cont=0;cont<=index;cont++,aux=aux.next)
        {
            if(cont==index)
            {
                return aux.nombre;
            }

        }
        return " \nNo se encontro el dato \n";

    }



    public void removeAllWithVlue(String data)
    {

    }
    public int getSize()
    {
        return size;

    }
    public LinkedListIterator getIterator()
    {
        LinkedListIterator iterator=new LinkedListIterator();
        iterator.head=head;
        iterator.tail=tail;
        iterator.size=size;




        return  iterator;
    }
}