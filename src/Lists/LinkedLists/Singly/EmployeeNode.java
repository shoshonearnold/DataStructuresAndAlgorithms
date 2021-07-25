package Lists.LinkedLists.Singly;

public class EmployeeNode {

    private EmployeeNode next;
    private Employee employee;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
