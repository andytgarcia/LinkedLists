public class MyDoublyLinkedListNode<T> {

    private T data;
    private MyDoublyLinkedListNode next;
    private MyDoublyLinkedListNode prev;


    public MyDoublyLinkedListNode(T data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(MyDoublyLinkedListNode<T> next) {
        this.next = next;
    }

    public MyDoublyLinkedListNode<T> getNext() {
        return next;
    }

    public MyDoublyLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(MyDoublyLinkedListNode<T> prev) {
        this.prev = prev;
    }
}
