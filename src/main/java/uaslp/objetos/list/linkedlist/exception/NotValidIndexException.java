package uaslp.objetos.list.linkedlist.exception;

public class NotValidIndexException extends Throwable {
    //
    public NotValidIndexException(int wrongIndex)
    {
        super( "index "+wrongIndex+" is out of bound");

    }
}
