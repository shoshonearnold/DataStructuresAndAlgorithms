package Lists.LinkedLists.Doubly;

public class EmployeeList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToBack(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public EmployeeNode removeFromBack() {
        if (isEmpty()) {
            return null;
        }


        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            return null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        removedNode.setPrevious(null);
        size--;
        return removedNode;
    }

    public boolean isEmpty() {
        return head == null;

    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}
