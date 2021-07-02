package Lists.LinkedLists.Singly;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Employee janeJones = (new Employee("jane", "jones", 123));
        Employee jimJones = (new Employee("JIm", "JOnes", 456));

        singlyLinkedList.addToFront(janeJones);
        singlyLinkedList.addToFront(jimJones);
        //singlyLinkedList.printList();
        singlyLinkedList.removeFromFront();
        singlyLinkedList.printList();
    }
}
