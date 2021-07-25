package Lists.LinkedLists.Doubly;

public class DoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int listSize;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNextNode(head);
        if (head == null) {
            tail = node;
        } else {
            head.setPreviousNode(node);
        }
        head = node;
        listSize++;
    }

    public void addToBack(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            node.setPreviousNode(tail);
            tail.setNextNode(node);
        }
        tail = node;
        listSize++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getListSize() {
        return listSize;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        if (head.getNextNode() == null) {
            tail = null;
        } else {
            head.getNextNode().setPreviousNode(null);
        }
        head = head.getNextNode();
        removedNode.setPreviousNode(null);
        listSize--;
        return removedNode;
    }

    public EmployeeNode removeFromBack() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = tail;
        if (tail.getPreviousNode() == null) {
            head = null;
        } else {
            tail.getPreviousNode().setNextNode(null);
        }
        tail = tail.getPreviousNode();
        removedNode.setNextNode(null);
        listSize--;
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNextNode();
        }
        System.out.print(" null");
    }
}
