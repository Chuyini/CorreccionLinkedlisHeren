package uaslp.objetos.list.linkedlist.linkedlist;

public class LinkedListIterator extends LinkedList {

int cont=0;



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
