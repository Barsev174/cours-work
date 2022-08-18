import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        Employee mihaylov = new Employee("Александр Михайлов", 1, 72115);
        Employee shorihin = new Employee("Дмитрий Шорихин", 4, 72115);
        Employee safonov = new Employee("Кирилл Сафонов", 2, 27556);
        Employee zakirov = new Employee("Артем Закиров", 1, 69885);
        Employee zikov = new Employee("Иван Зыков", 3, 66954);
        Employee akimkin = new Employee("Александр Акимкин", 4, 72114);
        Employee levchenko = new Employee("Олег Левченко", 1, 52696);
        Employee tatarnikov = new Employee("Денис Татарников", 5, 95331);
        Employee inozemcev = new Employee("Сергей Иноземцев", 3, 47331);
        Employee jarov = new Employee("Евгений Жаров", 2, 36464);

        employeeBook.putTheEmployeeDown(mihaylov);
        employeeBook.putTheEmployeeDown(shorihin);
        employeeBook.putTheEmployeeDown(safonov);
        employeeBook.putTheEmployeeDown(zakirov);
        employeeBook.putTheEmployeeDown(zikov);
        employeeBook.putTheEmployeeDown(akimkin);
        employeeBook.putTheEmployeeDown(levchenko);
        employeeBook.putTheEmployeeDown(tatarnikov);
        employeeBook.putTheEmployeeDown(inozemcev);
        employeeBook.putTheEmployeeDown(jarov);

        employeeBook.printAllEmployee(employeeBook);


        System.out.println("Сумма всех зарплат сотрудиков: " + employeeBook.countAllSalary(employeeBook));
        System.out.println("Минимальную зарплату имеет- " + employeeBook.searchMinSalary(employeeBook));
        System.out.println("Максимальную зарплату имеет- " + employeeBook.searchMaxSalary(employeeBook));
        System.out.println("Средняя зарплата по сотрудникам: " + employeeBook.averageSalary(employeeBook.countAllSalary(employeeBook), employeeBook));
        employeeBook.printTheNameOfAllEmployee(employeeBook);
        employeeBook.indexSalary(employeeBook, 1.15);
        System.out.println("Средняя зарплата по сотрудникам после индексации: " + employeeBook.averageSalary(employeeBook.countAllSalary(employeeBook), employeeBook));
        System.out.println("Наименьшую зарпалату по отделу имеет: " + employeeBook.findMinSalaryOfTheDepartment(employeeBook, 1));
        System.out.println("Наибольшую зарпалату по отделу имеет: " + employeeBook.findMaxSalaryOfDepartment(employeeBook, 1));
        System.out.println("Сумма зарплат отдела: " + employeeBook.countAllSalaryOfDepartment(employeeBook, 1));
        System.out.println("Средняя зарплата отдела: " + employeeBook.calculateTheAverageSalaryOfTheDepartment(employeeBook, 1));
        employeeBook.indexSalaryDepartment(employeeBook, 1, 1.15);
        System.out.println("Средняя зарплата отдела после индексации: " + employeeBook.calculateTheAverageSalaryOfTheDepartment(employeeBook, 1));
        employeeBook.printWithoutDepartment(employeeBook);
        employeeBook.findEmployeesWithALowerSalary(employeeBook, 50000);
        employeeBook.findEmployeesWithAHigherSalary(employeeBook, 50000);

        employeeBook.printNameEmployeeOfDepartment(employeeBook, 1);

        employeeBook.deleteEmployee(employeeBook, "Александр михайлов");
        employeeBook.printAllEmployee(employeeBook);
        employeeBook.putTheEmployeeDown(mihaylov);
        employeeBook.changeEmployee(employeeBook, "кирилл Сафонов", 92555, 3);
        employeeBook.printAllEmployee(employeeBook);
        employeeBook.printingEmployeesByDepartment(employeeBook);



    }
}


