public class MyLinkedList<T> {
    private MyListNode<T> first;
    private MyListNode<T> last;
    private int size = 0;

    public MyLinkedList() {
        first = null;
        last = null;
    }

    public void addFirst(T data) {
        MyListNode<T> temp = new MyListNode<>(data);

        //edge case: empty list
        if (first == null && last == null) {
            first = temp;
            last = temp;
        }

        else {
            temp.setNext(first);
            first = temp;
        }
        size++;
    }

    public void addLast(T data) {
        MyListNode<T> temp = new MyListNode<>(data);

        if (first == null && last == null) {
            first = temp;
            last = temp;
        }

        else {
            last.setNext(temp);
            last = temp;

        }
        size++;

    }

    public String toString() {
        MyListNode<T> current = first;
        String out = "";
        while (current != null){
            out+= current.getData() + "->";
            current = current.getNext();
        }
        out+= "null";
        return out;
    }

    public int size() {
        return size;
    }


    public T removeFirst() {
        if (first == null) {
            throw new NullPointerException("My LinkedList is empty");
        }
        else if (first == last) {
            first = null;
            last = null;
            return first.getData();
        }
        else {
            MyListNode<T> tempF = first;
            first = first.getNext();
            tempF.setNext(null);
            size--;
            return tempF.getData();
        }
    }

    public T removeLast() {
        if (first == null) {
            throw new NullPointerException("My LinkedList is empty");
        }
        else if (first == last) {
            first = null;
            last = null;
            size--;
            return last.getData();
        }
        else {
            MyListNode<T> temp = first.getNext();
            while (temp.getNext() != last)
                temp = temp.getNext();
            last = temp;
            last.setNext(null);
            size--;
            return temp.getData();
        }
    }

    public T removeIndex(int n) {
        if (first == null)
            throw new NullPointerException("My LinkedList is empty");
        else {
            int count = 1;
            MyListNode<T> prev = first;

            while (count != n-1){
                prev = prev.getNext();
                count++;
            }

            MyListNode<T> current = prev.getNext();


            MyListNode<T> next = current.getNext();

            if (next == null) {
                prev.setNext(null);
            }
            else {
                prev.setNext(next);
            }
            size--;
            return current.getData();

            //found previous, current, and next indexes for removable current, need to figure out how to shift everything over, can set next of previous to next
        }

    }

    public void addIndex(int n, T data) {
        if (first == null)
            throw new NullPointerException("My LinkedList is empty");
        else {
            int count = 1;
            MyListNode<T> prev = first;
            while (count != n - 1) {
                prev = prev.getNext();
                count++;
            }
            MyListNode<T> added = new MyListNode<T>(data);
            MyListNode<T> next = prev.getNext();
            prev.setNext(added);
            added.setNext(next);

        }
    }

}
