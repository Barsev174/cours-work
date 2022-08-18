public class Employee {
    private String nameEmployee;
    private int department;
    private double salary;
    private static int id;
    private final int numberCreation;



    public Employee(String nameEmployee, int department, int salary) {
        id++;
        this.numberCreation = getId();
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;


    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    private  int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumberCreation() {
        return numberCreation;
    }

    @Override
    public String toString() {
        return getDepartment() + " отдел : " + getNameEmployee() + " : зарплата " + getSalary();
    }
}