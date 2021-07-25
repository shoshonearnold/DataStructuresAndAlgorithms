package Lists.LinkedLists.Doubly;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode nextNode;
    private EmployeeNode previousNode;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeNode nextNode) {
        this.nextNode = nextNode;
    }

    public EmployeeNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(EmployeeNode previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
