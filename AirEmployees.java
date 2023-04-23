package homework.airport;

import homework.airport1.Employees;

import java.util.Objects;
//Added interface to the class hierarchy
public class AirEmployees extends Employees implements SalaryCalculator {
    private String department;
    private String designation;

    AirEmployees(String employeeName, String employeeId, String department,
                 String designation) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
    }

    //Abstract method from parent class is implemented
    @Override
    public void getEmployeeDetails() {
        System.out.println("AirEmployee Details");
        System.out.println("================");

    }

    //Used override method from class Object toString()
    @Override
    public String toString() {
        return "Employee Name:" + " " + this.employeeName + "\nEmployee ID:" + " " + this.employeeId
                + "\nEmployee Department:" + " " + this.department + "\nEmployee Designation:" + " "
                + this.designation;
    }

    //Used override method from class Object equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        AirEmployees obj1 = (AirEmployees) obj;
        return (obj1.employeeName.equals(this.employeeName)
                && obj1.employeeId.equals(this.employeeId)
                && obj1.department.equals(this.department)
                && obj1.designation.equals(this.designation));
    }

    //Used override method from class Object hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeId, department, designation);
    }

    @Override
    public double calculateSalary(int hourlyRate, int workingHours) {
        return hourlyRate * workingHours;
    }

}

