package uaslp.objetos.list.linkedlist.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.exception.NotValidIndexException;

public class ArrayListTest {
    @Test
    public void givenANewArrayList_whenAddTail_thenSizeIsOne() {
        //Given
        ArrayList<String> arryList = new ArrayList<>();
        arryList.addAtTail("Jesus");
        //when
        int size = arryList.getSize();
        //Then
        Assertions.assertEquals(1, size);//ejecucion
    }

    @Test
    public void givenANewArrayList_whenAddFront_thenSizeIsOne() {
        //Given
        ArrayList<String> arryList = new ArrayList<>();
        arryList.addAtFront("Jesus");
        //when
        int size = arryList.getSize();
        //Then
        Assertions.assertEquals(1, size);//ejecucion
    }

    @Test
    public void givenANewArrayListWhitOneElement_whenRemoveIt_thenSizeIsZero() {
        //Given
        ArrayList<String> arryList = new ArrayList<>();
        arryList.addAtFront("Jesus");
        //when
        arryList.remove(0);
        int size = arryList.getSize();
        //Then
        Assertions.assertEquals(0, size);//ejecucion
    }

    @Test
    public void givenAnArrayListWhit3Elements_whenRemoveAll_thenSizeIsZero() {
        //Given
        ArrayList<String> arryList = new ArrayList<>();
        arryList.addAtFront("Jesus");
        arryList.addAtFront("Jesus");
        arryList.addAtFront("Jesus");

        //when
        arryList.removeAll();
        int size = arryList.getSize();
        //Then
        Assertions.assertEquals(0, size);//ejecucion
    }

    @Test
    public void givenANArrayListWhit2eElement_whenSetAt_thenSetAtIsEquals() {
        //Given
        ArrayList<String> arryList = new ArrayList<>();
        arryList.addAtFront("Mundo");
        arryList.addAtFront("Hola");
        //when
        arryList.setAt(0, "Cruel");
        //Then
        Assertions.assertEquals("Cruel", arryList.getAt(0));//ejecucion
    }
    @Test
    public void givenANewArrayListWhit3Elements_whenGetIterator_thenWorksWell() throws NotValidIndexException {
        //Given
        ArrayList<String> arryList = new ArrayList<>();
        arryList.addAtTail("Jesus");
        arryList.addAtTail("Manuel");
        arryList.addAtTail("Lara");

        //when

        Iterator<String> iterator=arryList.getIterator();
        int size=arryList.getSize();
        //Then
        Assertions.assertEquals(3,size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Jesus",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Manuel",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Lara",iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
    @Test
    public void givenANewArrayList_whenPutSizeIn3_thenSizeIs3(){
        //Given
        ArrayList<String> arryList=new ArrayList<>(3);

        //when

        int size=arryList.getSize();
        //Then
        Assertions.assertEquals(3,size);//ejecucion
    }
    @Test
    public void givenANewArrayListWhit2Elements_whenAddTail_thenSizeIs3(){
        //Given
        ArrayList<String> arryList=new ArrayList<>(2);

        arryList.addAtTail("Hola");
        arryList.addAtTail("Mundo");

        //when

        arryList.addAtTail("Cruel");

        int size=arryList.getSize();
        //Then
        Assertions.assertEquals(5,size);//ejecucion
    }
    @Test
    public void givenANewArrayLisT_whenAddOneElement_thenThisElementIsEquals(){
        //Given
        ArrayList<String> arryList=new ArrayList<>();
        arryList.addAtTail("Jesus");

        //when

        //Then
        Assertions.assertEquals("Jesus",arryList.getAt(0));//ejecucion
    }
    @Test
    public void givenANewArrayLisT_whenAddOneElementDiferenr_thenThisElementIsNull(){
        //Given
        ArrayList<String> arryList=new ArrayList<>();


        //when

        //Then
        Assertions.assertEquals(null,arryList.getAt(0));//ejecucion
    }

}
