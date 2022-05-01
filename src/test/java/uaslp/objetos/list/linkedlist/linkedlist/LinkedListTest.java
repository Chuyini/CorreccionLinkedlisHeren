package uaslp.objetos.list.linkedlist.linkedlist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.linkedlist.exception.NotValidIndexException;

public class LinkedListTest {

    @Test
    public void givenANewList_whenGetSize_thenResultIsZero(){
        //Given
        LinkedList<String> list =new LinkedList<>();//inicializacion
        //when
        int size=list. getSize();
        //Then
        Assertions.assertEquals(0,size);//ejecucion
    }
    @Test
    public void givenANewList_whenGetAt_thenExceptionIsThrown(){
        //Given
        LinkedList<String> list =new LinkedList<>();//inicializacion
        //when
        try{
            list.getAt(0);
            Assertions.fail("An exception should be thrown getting element zero");
        }catch (NotValidIndexException ex)
        {

        }

        //Then

    }
    @Test
    public void givenANewList_whenAddAnElementAtTail_thenSizesIsOne () throws NotValidIndexException, NotNullValuesAllowedException {
        //given
        LinkedList<String> list =new LinkedList<>();
        //when
        list.addAtTail("hola");
        int size= list.getSize();
        //then      Se espera que aumente de tamaño la lista y que en la posicion 0 y en la funcion get nos regrese el nombre esperado
        Assertions.assertEquals(1, size);
        Assertions.assertEquals("hola",list.getAt(0));
    }
    @Test
    public void givenAListWhitTwoElements_whenAddAtTail_thenSizeIs2() throws NotNullValuesAllowedException,NotValidIndexException
    {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtTail("Jesus");
        list.addAtTail("Manuel");
        list.addAtTail("Lara");
        //when
        int size=list.getSize();
        //then
        Assertions.assertEquals(3,size);
    }
    @Test
    public void givenAListWhitTwoElements_whenAddAtFront_thenSizeIs2() throws NotNullValuesAllowedException,NotValidIndexException
    {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtFront("Jesus");
        list.addAtFront("Manuel");
        list.addAtFront("Lara");
        //when
        int size=list.getSize();
        //then
        Assertions.assertEquals(3,size);
    }




    @Test
    public void givenAListWhitTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionThrown() {
        //given
        LinkedList<String> list = new LinkedList<>();
        //when
        //then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()-> list.addAtTail(null));
    }
    @Test
    public void givenALListWhitTwoElements_whenSetAtNull_thenNotNullValuesException() {
        //given
        LinkedList<String> list = new LinkedList<>();
        //when
        //then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()-> list.setAt(0,null));
    }
    @Test
    public void givenAListWhit1Element_whenAddAtFrontAnElement_thenSizesIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //given
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("mundo");
        //when
        list.addAtFront("hola");
        int size=list.getSize();
        //then
        Assertions.assertEquals(2,size);
        Assertions.assertEquals("mundo",list.getAt(1));
        Assertions.assertEquals("hola",list.getAt(0));

    }
    @Test
    public void givenAListWhitTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionThrown() {
        //given
        LinkedList<String> list = new LinkedList<>();
        //when
        //then:
        Assertions.assertThrows(NotNullValuesAllowedException.class,()-> list.addAtFront(null));
    }
    @Test
    public void givenAListWhitTwoElements_whenRemove_thenSizeIsOne() throws NotNullValuesAllowedException,NotValidIndexException
    {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtFront("Jesus");
        //when
        list.remove(0);
        int size=list.getSize();
        //then
        Assertions.assertEquals(0,size);
    }
    @Test
    public void givenAListWhitTwoElements_whenRemoveTheFirst_thenSizeIsOne() throws NotNullValuesAllowedException,NotValidIndexException
    {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtTail("Jesus");
        list.addAtTail("Manuel");
        //when
        list.remove(1);
        int size=list.getSize();
        //then
        Assertions.assertEquals(1,size);
    }
    @Test
    public void givenAListWhitTwoElements_whenRemoveTheLats_thenSizeIsOne() throws NotNullValuesAllowedException,NotValidIndexException
    {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtTail("Jesus");
        list.addAtTail("Manuel");
        //when
        list.remove(0);
        int size=list.getSize();
        //then
        Assertions.assertEquals(1,size);
    }
    @Test
    public void givenAListWhitTwoElements_whenRemoveElement2_thenNotValidIndexExceptionThrown() throws NotNullValuesAllowedException{
        //given
        LinkedList<String> list = new LinkedList<>();
        list.addAtFront("Jesus");
        list.addAtTail("Manuel");
        //when
        //then:

        Assertions.assertThrows(NotValidIndexException.class,()-> list.remove(2));


    }




    @Test
    public void givenAListWhit3Elements_whenRemoveIndex1_thenSizeIsTwo() throws NotNullValuesAllowedException,NotValidIndexException
    {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtFront("Jesus");
        list.addAtFront("Jesus");
        list.addAtFront("Jesus");
        //when
        list.remove(1);
        int size=list.getSize();
        //then
        Assertions.assertEquals(2,size);
    }
    @Test
    public void givenAListWhit3Elements_whenRemoveAll_thenSizeIsZero() throws NotNullValuesAllowedException
    {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtFront("Jesus");
        list.addAtFront("Jesus");
        list.addAtFront("Jesus");
        //when
        list.removeAll();
        int size=list.getSize();
        //then
        Assertions.assertEquals(0,size);
    }
    @Test
    public void givenAListWhit2Elements_whenSetAt_thenElementIsModified() throws NotNullValuesAllowedException, NotValidIndexException {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtFront("Adios");
        list.addAtFront("Mundo");
        //when
        list.setAt(0,"Hola");

        //then
        Assertions.assertEquals("Hola",list.getAt(0));
        Assertions.assertEquals("Adios",list.getAt(1));
    }
    @Test
    public void givenAListWhit2Elements_whenSetAtElement2_thenElementIsModified() throws NotNullValuesAllowedException, NotValidIndexException {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtTail("Adios");
        list.addAtFront("Mundo");
        //when
        list.setAt(1,"Hola");

        //then
        Assertions.assertEquals("Mundo",list.getAt(0));
        Assertions.assertEquals("Hola",list.getAt(1));
    }
    @Test
    public void givenAListWhitTwoElements_whenSetAtIndex3_thenNotValidIndexExceptionThrown() throws NotNullValuesAllowedException {
        //given
        LinkedList<String> list = new LinkedList<>();
        list.addAtFront("Jesus");
        list.addAtTail("Manuel");
        //when
        //then:

        Assertions.assertThrows(NotValidIndexException.class,()-> list.setAt(2,"valor"));


    }
    @Test
    public void givenAListWhit3Elements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotNullValuesAllowedException, NotValidIndexException {
        //given
        LinkedList<String> list=new LinkedList<>();
        list.addAtTail("Adios");
        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        //when
        Iterator<String> iterator= list.getIterator();

        int size=list.getSize();
        //then
        Assertions.assertEquals(3,size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adios",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo",iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel",iterator.next());
        Assertions.assertFalse(iterator.hasNext());
    }
}

