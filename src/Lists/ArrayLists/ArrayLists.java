package Lists.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();

        Employee janeJones = (new Employee("jane", "jones", 123));
        Employee jimJones = (new Employee("jim", "jones", 456));

        employee.add(janeJones);
        employee.add(jimJones);

    }


}
