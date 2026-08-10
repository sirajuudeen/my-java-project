package org.example;

public class Employee {
    public int empId;
  //  private int id;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getId() {
        return empId;
    }

    public void setId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
