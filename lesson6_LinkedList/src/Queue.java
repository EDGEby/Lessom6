

public class Queue<T> implements UniQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    Queue(){
        head=null;
        tail=null;
    }

    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder buf=new StringBuilder();
        while(current!=null){
            buf.append(current.data.toString());
            buf.append(" ");
            current=current.next;
        }

        return buf.toString();
    }

    @Override
    public boolean isEmpty() {
        return (head==null && tail==null);
    }

    @Override
    public void addElement(T data) {
        Node<T> newNode=new Node<>(data);
        if (isEmpty()){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    @Override
    public T removeElement() {
       T queueHeadData=peekFirst();
        if (head==tail){
            queueHeadData = head.data;
            head=null;
            tail=null;
        }
        else{
            queueHeadData = head.data;
            head=head.next;
        }
        return queueHeadData;
    }

    @Override
    public T peekFirst() throws NullPointerException {
        if (isEmpty())
            throw new NullPointerException("Queue is empty");
        return head.data;
    }
}
