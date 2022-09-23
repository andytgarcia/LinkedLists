public class MyDoublyLinkedList<T> {
    private MyDoublyLinkedListNode<T> first;
    private MyDoublyLinkedListNode<T> last;
    private int size;

    public MyDoublyLinkedList() {
        first = null;
        last = null;

    }

    public void addFirst(T data) {
        MyDoublyLinkedListNode<T> temp = new MyDoublyLinkedListNode<>(data);

        //edge case: empty list
        if (first == null && last == null) {
            first = temp;
            last = temp;
        }

        else {
            temp.setNext(first);
            first.setPrev(temp);
            first = temp;
        }
        size++;
    }

    public void addLast(T data) {
        MyDoublyLinkedListNode<T> temp = new MyDoublyLinkedListNode<>(data);

        if (first == null && last == null) {
            first = temp;
            last = temp;
        }
        else {
            last.setNext(temp);
            temp.setPrev(last);
            last = temp;

        }
        size++;

    }



    public String toString() {
        MyDoublyLinkedListNode<T> current = first;
        String out = "";
        while (current != null){
            out+= current.getData() + "<-->";
            current = current.getNext();
        }
        out+= "null";
        return out;
    }

}
