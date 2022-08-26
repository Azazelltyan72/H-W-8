public class Main {
    public static void foundLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "  — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }
    public static void printToClientOpS(int clientOpS, int clientDeviceYear) {
        int currentYear = 2022;
        if (clientOpS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite версию приложения для Android по ссылке");
        } else if (clientOpS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOpS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite версию приложения для iOS по ссылке");
        } else if (clientOpS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static int deliveryWillTake(int deliveryDistance) {
        int deliveryDays = 1;
        int interval = 40;
        int startinterval = 20;
        if (deliveryDistance <= startinterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startinterval) / (double) interval);
        } return deliveryDays;
    }
    public static void main(String[] args) {
        // Задание 1
        int leapYear = 5890;
        foundLeapYear(leapYear);
        // Задание 2
        int clientOpS = 1;
        int clientDeviceYear = 2022;
        printToClientOpS(clientOpS, clientDeviceYear);
        // Задание 3
        int deliveryDistance = 95;
        int total = deliveryWillTake(deliveryDistance);
        System.out.println("Потребуется дней: " + total);

    }


}