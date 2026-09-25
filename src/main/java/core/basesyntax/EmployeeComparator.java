package core.basesyntax;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee first, Employee second) {
        int ageResult = Integer.compare(first.getAge(), second.getAge());
        if (ageResult != 0) {
            return ageResult;
        }
        return first.getName().compareTo(second.getName());
    }
}
