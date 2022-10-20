package lesson6;

public class Stack<T> implements Stackable<T> {
    private Node<T> head;
    Stack(){
        head =null;}

    @Override
    public boolean IsEmpty() {
        return head ==null;
    }
    @Override
    public void push(T data) {
        Node<T> newNode= new Node<>(data);
        newNode.next= head;
        head =newNode;
    }
    @Override
    public T peek() throws NullPointerException {
        if (IsEmpty())
            throw new NullPointerException("Stack is empty");
        return head.data;
    }
    @Override
    public T pop() {
        T topData=peek();
        head=head.next;
        return topData;
    }

    @Override
    public String toString() {
        Node<T> current = head;
        StringBuilder buf = new StringBuilder();
        while (current!=null){
            buf.append(current.data);
            buf.append(" ");
            current=current.next;
        }
        return buf.toString();
    }
}
