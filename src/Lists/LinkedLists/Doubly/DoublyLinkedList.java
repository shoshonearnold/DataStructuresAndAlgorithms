package Lists.LinkedLists.Doubly;

public class DoublyLinkedList {
    public static void main(String[] args) {

        EmployeeList employeeList = new EmployeeList();

        Employee janeJones = (new Employee("jane", "Jones", 123));
        Employee jimJones = (new Employee("jim", "Jones", 123));
        Employee jimEnd = (new Employee("jim", "End", 456));

        employeeList.addToBack(jimEnd);
        employeeList.addToFront(janeJones);
        employeeList.addToFront(jimJones);

        employeeList.printList();



    }
}
