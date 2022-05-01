package uaslp.objetos.list.linkedlist.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.linkedlist.Iterator;
import uaslp.objetos.list.linkedlist.List;
import uaslp.objetos.list.linkedlist.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.linkedlist.exception.NotSuchElementException;
import uaslp.objetos.list.linkedlist.exception.NotValidIndexException;
import uaslp.objetos.list.linkedlist.hashset.HashSet;

public class HashSetTest{

//entrar una vez y que size sea =1 luego
    //dar 5 datos y uno mas para que sean 6
    //asi cubriremos toda la primer funcion
    @Test
public void givenAHashSet_whenAddOne_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException
{
    //given
    HashSet<String> hashSet= new HashSet<>();
    //when
    hashSet.add("Jesus");
    int size=hashSet.size();
    //then
    Assertions.assertEquals(1,size);
}
@Test
    public void givenAHashSetWhit5ElementsAndLongEqualsWhitTheSameHasCode_whenAddOneMore_thenSizeIs6() throws NotNullValuesAllowedException, NotValidIndexException
    {
        //given
        HashSet<objetin> hashSet= new HashSet<>();
        objetin ob1=new objetin();
        objetin ob2=new objetin();
        objetin ob3=new objetin();
        objetin ob4=new objetin();
        objetin ob5=new objetin();
        objetin ob6=new objetin();
        //When
        hashSet.add(ob1);
        hashSet.add(ob2);
        hashSet.add(ob3);
        hashSet.add(ob4);
        hashSet.add(ob5);
        hashSet.add(ob6);
        int size=hashSet.size();
        //then
        Assertions.assertEquals(6,size);
    }
    @Test
    public void givenAHashSetWhit3Elements_whenRemoveOne_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException
    {
        //given
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("Jesus");
        hashSet.add("Mundo");
        hashSet.add("Lara");
        //when
        hashSet.remove("Mundo");
        int size=hashSet.size();
        //then
        Assertions.assertEquals(2,size);
    }
    @Test
    public void givenAHashSetWhit2tElements_whenAssertEqualsAnAnyElement_thenIsTrue() throws NotNullValuesAllowedException, NotValidIndexException
    {
        //given
        HashSet<String> hashSet= new HashSet<>();
        //when
        hashSet.add("Jesus");
        hashSet.add("Lara");

        //then
        Assertions.assertTrue(hashSet.contains("Lara"));
    }
    @Test
    public void givenAHashSetWhit2tElements_whenTryToFoundAnyElement_thenIsFalse() throws NotNullValuesAllowedException, NotValidIndexException
    {
        //given
        HashSet<String> hashSet= new HashSet<>();
        //when
        hashSet.add("Jesus");
        hashSet.add("Lara");

        //then
        Assertions.assertFalse(hashSet.contains("Vazquez"));
    }

    @Test
    public void givenAHashSetWhit2tElementsAndGetIterator_whenHasNext_thenIsTrueAndIteratorWorksWell() throws NotNullValuesAllowedException, NotValidIndexException
    {
        //given
        HashSet<String> hashSet= new HashSet<>();
        //when
        hashSet.add("Jesus");
        hashSet.add("Lara");
        Iterator<String> iterator= hashSet.iterator();

        //then
        iterator.next();
        Assertions.assertTrue(iterator.hasNext());
        iterator.next();
        Assertions.assertFalse(iterator.hasNext());

    }
    @Test
    public void givenAHashSetWhit2tElementsAndGetIterator_whenHasNextAndThereArentNothing_thenExceptioNotSuchElementIsThrown() throws NotNullValuesAllowedException, NotValidIndexException
    {
        //given
        HashSet<String> hashSet= new HashSet<>();
        //when
        hashSet.add("Jesus");
        hashSet.add("Lara");
        Iterator<String> iterator= hashSet.iterator();

        //then
        iterator.next();
       iterator.next();
       Assertions.assertThrows(NotSuchElementException.class,()->iterator.next());

    }




}
