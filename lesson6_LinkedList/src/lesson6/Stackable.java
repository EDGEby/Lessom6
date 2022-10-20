package lesson6;

public interface Stackable<T> {
    void push(T data);
    T peek();
    T pop();
    String toString();
    boolean IsEmpty();

}
