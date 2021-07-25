package Lists.LinkedLists.Doubly;

public class Main {

    public static void main(String[] args) {


        DoublyLinkedList list = new DoublyLinkedList();

        Employee janeJones = (new Employee("jane", "Jones", 123));
        Employee jimJones = (new Employee("Jim", "Jones", 456));
        Employee jackEnd = (new Employee("Jack", "End", 999));

        list.addToBack(jackEnd);
        list.addToFront(janeJones);
        list.addToFront(jimJones);
        //list.printList();
        list.removeFromBack();
        list.printList();
    }
}
