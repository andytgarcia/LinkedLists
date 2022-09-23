
public class MyListNode<T> {

    private T data;
    private MyListNode next;

    public MyListNode(T data) {
        this.data = data;
        next = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(MyListNode<T> next) {
        this.next = next;
    }

    public MyListNode<T> getNext() {
        return next;
    }

}
