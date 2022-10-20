package lesson7;

public class DoubleLinkedList<T> implements InterfaceDoubleLinkedList<T> {
    DLLNode<T> head;
    DLLNode<T> tail;

    public DoubleLinkedList(){
        head=null;
        tail=null;
    }

    @Override
    public boolean isEmpty() { return (head==null && tail==null); }
    @Override
    public void addFirst(T data) {
        DLLNode<T> newNode=new DLLNode<>(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }

    }
    @Override
    public void addLast(T data) {
        DLLNode<T> newNode=new DLLNode<>(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
        }else{
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    @Override
    public void removeFirst() {
        if(!isEmpty()){
            if (head==tail) head = tail = null;
            else {
                head = head.next;
                head.prev.next=null;
                head.prev=null;
            }
        }

    }
    @Override
    public void removeLast() {
        if(!isEmpty()){
            if (head==tail) head = tail = null;
            else {
                tail = tail.prev;
                (tail.next).prev=null;
                tail.next=null;
            }
        }
    }
    @Override
    public T getFirst() throws NullPointerException {
        if (isEmpty()) throw new NullPointerException("List is empty");
        return head.data;

    }
    @Override
    public T getLast() throws NullPointerException{
        if (isEmpty()) throw new NullPointerException("List is empty");
        return tail.data;
    }
    @Override
    public void removeAll() {
        DLLNode<T> current= head;
        while(current!=null){
            current=current.next;
            current.prev.next=null;
            current.prev=null;
        }
        head=tail=null;

    }

    @Override
    public String toString() {
        StringBuilder buf= new StringBuilder();
        DLLNode<T> current = head;
        while(current!=null){
            buf.append(current.data);
            buf.append(" ");
            current=current.next;
        }
        return buf.toString();
    }
}
