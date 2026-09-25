package core.basesyntax;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeeByOrder(List<Employee> employees) {
        Set<Employee> sortedEmployees = new TreeSet<>(new EmployeeComparator());
        sortedEmployees.addAll(employees);
        return sortedEmployees;
    }
}
