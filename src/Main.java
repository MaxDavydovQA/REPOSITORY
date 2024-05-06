class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}

class Park {
    class Attraction {
        String name;
        String timeOfWork;
        double cost;

        public Attraction(String name, String timeOfWork, double cost) {
            this.name = name;
            this.timeOfWork = timeOfWork;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + timeOfWork);
            System.out.println("Стоимость: " + cost);
            System.out.println();
        }
    }

    public void addAttraction(String name, String timeOfWork, double cost) {
        Attraction attraction = new Attraction(name, timeOfWork, cost);
        attraction.printAttractionInfo();
    }
}

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Илья", "Инженер", "ivanov@mail.com", "893456789", 50000, 35);
        employees[1] = new Employee("Петров Андрей", "Программист", "petrov@mail.com", "897654321", 60000, 28);
        employees[2] = new Employee("Сидоров Глеб", "Дизайнер", "sidorov@mail.com", "898555555", 45000, 40);
        employees[3] = new Employee("Кузнецов Марк", "Менеджер", "kuznecov@mail.com", "891100011", 55000, 32);
        employees[4] = new Employee("Федоров Кирилл", "Тестировщик", "fedorov@mail.com", "899799799", 48000, 25);

        System.out.println("Информация о сотрудниках:");
        for (Employee employee : employees) {
            employee.printInfo();
        }

        Park park = new Park();
        System.out.println("Информация об аттракционах:");
        park.addAttraction("Тир", "10:00 - 22:00", 500);
        park.addAttraction("Центрифуга", "11:00 - 20:00", 700);
        park.addAttraction("Карусель", "09:00 - 21:00", 300);
    }
}

