import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employeeBook;

    public EmployeeBook(int n) {
        this.employeeBook = new Employee[n];
    }

    public void putTheEmployeeDown(Employee employee) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i] == null) {
                employeeBook[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(EmployeeBook employee, String name) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getNameEmployee().equalsIgnoreCase(name)) {
                employeeBook[i] = null;
            }
        }
    }

    public void changeEmployee(EmployeeBook employee, String nameEmployee, int newSalary, int newDepartment) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getNameEmployee().equalsIgnoreCase(nameEmployee)) {
                employeeBook[i].setSalary(newSalary);
                employeeBook[i].setDepartment(newDepartment);
            }
        }
    }

    public void printingEmployeesByDepartment(EmployeeBook employee) { // некравиво работает метод, пока не могу разобраться, идеи закончились. Оставил, как осенит - поправлю.
        for (int i = 1; i < 6; i++) {
            System.out.print("В отделе №" + i + " работают следующие сотрудники: ");
            for (int j = 0; j < employeeBook.length; j++) {
                if (j == employeeBook.length - 1) {
                    if (employeeBook[j].getDepartment() == i) {
                        System.out.println(employeeBook[j].getNameEmployee() + ".");
                    } else {
                        System.out.println(".");
                    }
                } else {
                    if (employeeBook[j].getDepartment() == i) {
                        System.out.print(employeeBook[j].getNameEmployee() + ", ");
                    }
                }
            }
        }
    }


    public void printAllEmployee(EmployeeBook employee) {
        System.out.println(Arrays.toString(employeeBook));
    }

    public int countAllSalary(EmployeeBook employee) {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            sum += employeeBook[i].getSalary();
        }
        return sum;
    }

    public Employee searchMinSalary(EmployeeBook employee) {
        Employee min = null;
        for (Employee obj : employeeBook) {
            if (min == null || obj.getSalary() < min.getSalary()) {
                min = obj;
            }
        }
        return min;
    }

    public Employee searchMaxSalary(EmployeeBook employee) {
        Employee max = null;
        for (Employee obj : employeeBook) {
            if (max == null || obj.getSalary() > max.getSalary()) {
                max = obj;
            }
        }
        return max;
    }

    public int averageSalary(int sum, EmployeeBook employee) {
        return countAllSalary(employee) / employeeBook.length;
    }

    public void printTheNameOfAllEmployee(EmployeeBook employee) {
        System.out.print("Список имен всех сотрудников: ");
        for (int i = 0; i < employeeBook.length; i++) {
            System.out.print(employeeBook[i].getNameEmployee());
            if (i != employeeBook.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void printWithoutDepartment(EmployeeBook employee) {
        System.out.print("Информация о сотрудниках без учета отдела: ");
        for (int i = 0; i < employeeBook.length; i++) {
            System.out.print(employeeBook[i].getNameEmployee() + " " + employeeBook[i].getSalary());
            if (i != employeeBook.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void indexSalary(EmployeeBook employee, double index) {
        for (int i = 0; i < employeeBook.length; i++) {
            employeeBook[i].setSalary((int) (index * employeeBook[i].getSalary()));
        }
    }

    public Employee findMinSalaryOfTheDepartment(EmployeeBook employee, int department) {
        Employee min = null;
        for (int i = 0; i < employeeBook.length; i++) {
            if (min == null || employeeBook[i].getDepartment() == department && employeeBook[i].getSalary() < min.getSalary()) {
                min = employeeBook[i];
            }
        }
        return min;
    }

    public Employee findMaxSalaryOfDepartment(EmployeeBook employee, int department) {
        Employee max = null;
        for (int i = 0; i < employeeBook.length; i++) {
            if (max == null || employeeBook[i].getDepartment() == department && employeeBook[i].getSalary() > max.getSalary()) {
                max = employeeBook[i];
            }
        }
        return max;
    }

    public int countAllSalaryOfDepartment(EmployeeBook employee, int department) {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department) {
                sum += employeeBook[i].getSalary();
            }
        }
        return sum;
    }

    public int calculateTheAverageSalaryOfTheDepartment(EmployeeBook employee, int department) {
        int sum = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department) {
                sum += employeeBook[i].getSalary();
            }
        }
        int quantityEmployeesInDepartment = 0;
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department) {
                quantityEmployeesInDepartment++;
            }
        }
        return sum / quantityEmployeesInDepartment;
    }

    public void indexSalaryDepartment(EmployeeBook employee, int department, double index) {
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department) {
                employeeBook[i].setSalary((int) (index * employeeBook[i].getSalary()));
            }
        }
    }

    public void printNameEmployeeOfDepartment(EmployeeBook employee, int department) {
        System.out.print("Список имен всех сотрудников отдела: ");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getDepartment() == department && i != employeeBook.length) {
                System.out.print(employeeBook[i].getNameEmployee() + " - " + employeeBook[i].getSalary() + ", ");
            } else if (employeeBook[i].getDepartment() == department && i == employeeBook.length) {
                System.out.print(employeeBook[i].getNameEmployee() + " - " + employeeBook[i].getSalary());
            }
        }
        System.out.println();
    }

    public void findEmployeesWithALowerSalary(EmployeeBook employee, double salary) {
        System.out.print("Зарплата ниже, заданной у следующих сотрудников: ");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getSalary() <= salary && i != employeeBook.length) {
                System.out.print(employeeBook[i].getNumberCreation() + " " + employeeBook[i].getNameEmployee() + " " + employeeBook[i].getSalary() + ", ");
            }
        }
        System.out.println();
    }

    public void findEmployeesWithAHigherSalary(EmployeeBook employee, double salary) {
        System.out.print("Зарплата выше, заданной у следующих сотрудников: ");
        for (int i = 0; i < employeeBook.length; i++) {
            if (employeeBook[i].getSalary() >= salary && i != employeeBook.length) {
                System.out.print(employeeBook[i].getNumberCreation() + " " + employeeBook[i].getNameEmployee() + " " + employeeBook[i].getSalary() + ", ");
            }
        }
        System.out.println();
    }

}