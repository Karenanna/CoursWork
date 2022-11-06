public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private int id;

    private static int counter;

    public Employee(String fullName, int salary, int department) {
        this.department = department;
        this.fullName = fullName;
        this.salary = salary;
        id = counter;
        counter++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    @Override
    public String toString (){
         return id+ ". " + fullName + "; Номер отдела:" + department + "; Зарплата:" + salary;
    }
}
