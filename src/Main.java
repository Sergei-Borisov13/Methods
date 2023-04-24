import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public static int delivery(int distance) {
        int delivery = 1;
        if (distance > 20) {
            delivery++;
        }
        if (distance > 60) {
            delivery++;
        }
        return delivery;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        checkYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2023;
        int clientOS = 1;
        checkDevice(clientOS, clientDeviceYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int maxDeliveryDistance = 100;
        if (deliveryDistance <= maxDeliveryDistance) {
            int timeDelivery = delivery(deliveryDistance);
            System.out.println("Потребуется дней: " + timeDelivery);
        } else {
            System.out.println("Доставки нет");
        }
    }
}
