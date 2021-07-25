package Lists.LinkedLists.Singly;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        Employee janeJones = (new Employee("jane", "jones", 123));
        Employee jimJones = (new Employee("jim", "jones", 456));

        list.addToFront(janeJones);
        list.addToFront(jimJones);
        list.printList();
    }
}
