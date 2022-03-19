package uaslp.objetos.list.linkedlist.arraylist;


public class ArrayList {
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


    public void addAtTail (String data)
    {
        if(size== array.length)
        {
            incrementaArreglo();
        }
        array[size]=data;
        size++;

    }
    public void addAtFront(String data)
    {
        String aux;
        aux=array[1];
        int cont;


        array[1]=array[0];
        for ( cont = 0; cont<size; cont++)
        {
            aux=array[cont+1];
           array[cont+1]=array[cont];
        }
        array[cont]=aux;

        array[0]=data;
        size++;

    }
    public void remove(int index)
    {
        for(int cont=index;cont<size;cont++)
        {
            array[cont]=array[cont+1];
        }
        array[size-1]=null;
        size--;
    }
    public void removeAll()
    {
        for (int cont=0;cont<size;cont++)
        {
            array[cont]=null;
        }
        size=0;
    }
    public void setAt(int index, String data) {
        if(index>=0&& index<size)
        {array[index]=data;}


    }

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
    public int getSize()
    {
        return size;
    }

    public ArrayListIterator getIterator()
    {
        ArrayListIterator ArrayListIterator;
        return ArrayListIterator=new ArrayListIterator(this);
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
