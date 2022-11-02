public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Анопко Иван Анатолевич", 25000, 4);
        employees[1] = new Employee("Семенова Яна Витальевна", 25000, 3);
        employees[2] = new Employee("Антонов Константин Борисович", 25000, 2);
        employees[3] = new Employee("Милькевич Кристина Андреевна", 23000, 1);
        employees[4] = new Employee("Тихонов Александр Александрович", 30000, 5);
        employees[5] = new Employee("Яриков Сергей Дмитревич", 32000, 2);
        employees[6] = new Employee("Атаджанян Анна Григорьевна", 35000, 1);
        employees[7] = new Employee("Алиев Бегали Вахитович", 35000, 4);
        employees[8] = new Employee("Соловев Евгений Сергеевич", 40000, 3);
        employees[9] = new Employee("Семенова Анна Васильевна", 25000, 5);
        arrPrint();
        System.out.println("Сумма зарплат работников - " + salariesSum());
        System.out.println("Сотрудник с минимальной зп - " + minSalary());
        System.out.println("Сотрудник с максимальной зп - " + maxSalary());
        System.out.println("Средняя зп сотрудников - " + averageSalary());
        printFullNames();
    }

    public static void arrPrint() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static int salariesSum() {
        int result = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                result += employees[i].getSalary();
            }
        }
        return result;
    }

    public static Employee minSalary() {
        Employee result = employees[0];
        int min = 400_000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                result = employees[i];

            }

        }
        return result;

    }

    public static Employee maxSalary() {
        Employee result = employees[0];
        int max = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }
    public static int averageSalary(){
        int notNullElement =0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                notNullElement++;

            }

        }
        return salariesSum()/ notNullElement;

    }

    public static void printFullNames() {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                System.out.println(employees[i].getFullName());
            }

        }
    }
}

