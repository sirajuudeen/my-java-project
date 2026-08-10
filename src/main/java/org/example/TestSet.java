package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class employeeTest {
    int empId;
    String name;

    void Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      /*  if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.getId() &&
                Objects.equals(name, employee.getName());*/

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee)obj;
        if (empId != other.empId)
            return false;
        if (name == null) {
            if (other.getName() != null)
                return false;
        } else if (!name.equals(other.getName()))
            return false;
        return true;
    }
    }




public class TestSet {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();

        set.add(new Employee(1, "Siraj"));
        set.add(new Employee(1, "Siraj"));

        System.out.println(set.toString()); // Output: 2 ❌
    }
}

