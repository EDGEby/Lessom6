package lesson7;

public class DLLNode<T>  {
    T data;
    DLLNode<T> next;
    DLLNode<T> prev;

    public DLLNode(T data){
       this.data=data;
       this.next=null;
        this.prev=null;
    }
}
