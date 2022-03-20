package uaslp.objetos.list.linkedlist.arraylist;
import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.List;


import javax.swing.*;

public class ArrayList implements List {
    private static final int DEFAULT_SIZE=50;//#Define DEFAULT_SIZE 50. estatico para generar varias copias en cada objeto
    private String array[];
    int size=0; //Tipos primitivos se igualan a 0

    public ArrayList()//sobre carga de metodos de constructores
    {
        array=new String[DEFAULT_SIZE];

    }

    ArrayList(int size){
       array=new String[size];// creamos el arreglo con el tamaño size indicado por el usuario
    }

@Override
    public void addAtTail (String data)
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
    public void addAtFront(String data)
    {
        String aux;
        aux=array[1];
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
    public void setAt(int index, String data) {
        if(index>=0&& index<size)
        {array[index]=data;}


    }
    @Override
    public String getAt(int index)
    {
        if(index>=0&&index<size)
        {
            return array[index];

        }else
        {
            return null;
        }
    }

    public void removeAllWithVlue(String data)
    {

    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public Iterator getIterator()
    {

        return new ArrayListIterator(this);
    }

    private void incrementaArreglo()
    {
        String newArray[]=new String[array.length*2];
        for (int cont=0;cont<size;cont++)
        {
            newArray[cont]=array[cont];

        }
        array=newArray;
    }

}
