package uaslp.objetos.list.linkedlist.linkedlist;

import uaslp.objetos.list.linkedlist.Iterator;

public class LinkedListIterator implements Iterator {

int cont=0;
Node head;
int size;

public LinkedListIterator(Node head,int size)
{
    this.head=head;
    this.size=size;

}


  public boolean hasNext()
  {



      if(cont==size)
      {

          return false;
      }else
      {
          return true;
      }


  }
   public String next()
   {

       if(head.next==null) {
           cont++;
       return head.nombre;

       }


head=head.next;


       cont++;
       return head.previous.nombre;
   }
}
