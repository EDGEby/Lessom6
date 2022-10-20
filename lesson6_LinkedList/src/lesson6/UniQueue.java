package lesson6;

interface UniQueue<T> {
    boolean isEmpty();
    void addElement(T data);
    T removeElement();
    T peekFirst();
}
