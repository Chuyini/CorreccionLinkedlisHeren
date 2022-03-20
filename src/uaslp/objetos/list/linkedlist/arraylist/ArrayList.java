package uaslp.objetos.list.linkedlist.arraylist;
import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.List;
public class ArrayList <T> implements List <T> {
    private static final int DEFAULT_SIZE=50;//#Define DEFAULT_SIZE 50. estatico para generar varias copias en cada objeto
    private T array[];
    int size=0; //Tipos primitivos se igualan a 0
    public ArrayList()//sobre carga de metodos de constructores
    {
        array=(T[]) new Object[DEFAULT_SIZE];
    }
    ArrayList(int size){
       array=(T[])new Object[size];// creamos el arreglo con el tamaño size indicado por el usuario
    }
@Override
    public void addAtTail (T data)
    {
        if(size== array.length)
        {
            incrementaArreglo();
            array[size+1]=data;
        }
        array[size]=data;
        size++;
    }
    @Override
    public void addAtFront(T data)
    {
       T aux;

        int cont;



        for ( cont = size; cont>=0; cont--)
        {

           array[cont+1]=array[cont];
        }


        array[0]=data;
        size++;

    }
    @Override
    public void remove(int index)
    {
        if(size==0)
        {
            return;
        }

        for(int cont=index;cont<size;cont++)
        {
            array[cont]=array[cont+1];
        }
        array[size]=null;
        size--;
    }
    @Override
    public void removeAll()
    {
        for (int cont=0;cont<size;cont++)
        {
            array[cont]=null;
        }
        size=0;
    }
    @Override
    public void setAt(int index, T data) {
        if(index>=0&& index<size)
        {array[index]=data;}


    }
    @Override
    public T getAt(int index)
    {
        if(index>=0&&index<size)
        {
            return array[index];

        }else
        {
            return null;
        }
    }

    public void removeAllWithVlue(T data)
    {

    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public Iterator <T> getIterator()
    {

        return new ArrayListIterator<T>(this);
    }

    private void incrementaArreglo()
    {
        T newArray[]=(T[])new Object[array.length*2];
        for (int cont=0;cont<size;cont++)
        {
            newArray[cont]=array[cont];

        }
        array=newArray;
    }

}
