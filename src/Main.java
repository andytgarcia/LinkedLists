import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyDoublyLinkedList<Integer> dubList = new MyDoublyLinkedList<>();


        dubList.addFirst(1);
        dubList.addFirst(2);
        dubList.addFirst(3);
        dubList.addLast(4);
        

        System.out.println(dubList);
        dubList.removeFirst();
        System.out.println(dubList); 
        dubList.removeLast();
        System.out.println(dubList);       

        /*System.out.println(list);

        list.addFirst(5);
        list.addFirst(55);
        list.addFirst(3);
        list.addFirst(111);
        list.addLast(3);
        list.addLast(6);
        list.addLast(7);

        System.out.println(list);
        System.out.println(list.size());

        list.removeLast();
        System.out.println(list);

        list.removeIndex(4);
        System.out.println(list);

        list.addIndex(4, 5);
        System.out.println(list);

*/


    }
}
