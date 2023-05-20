public class Main {
    public static void main(String[] args) {

        /// task1

        int clientOS = 0;
        if (clientOS == 0) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1) {

            System.out.println("«Установите версию приложения для Android по ссылке».");

        }

        /// task 2
        int clientDeviceYear = 2014;
        int clientOSS = 1;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOSS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOSS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию для iOS по сслыке");
        {

        }


        ///task3

        int year = 2025;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является высокостным ");
        } else {
            System.out.println(year + " год не является высокостным ");
        }

        /// task 4

        int delivery = 4;
        int dayTime = 1;


        if (delivery < 20) {
            System.out.println(" Потребуется дней " + dayTime);
        } else if (delivery >= 20 && delivery < 60) {
            System.out.println(" Потребуется дней " + (dayTime + 1));
        } else if (delivery >= 60 && delivery < 100) {
            System.out.println("Потребуется дней " + (dayTime + 2));
        } else if (delivery >= 100) {
            System.out.println(" Доставки нет");
        }


        /// task5
        int monthNumber = 2;

        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println(" зима ");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(" весна ");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(" лето ");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println(" такого месяца не сушествует ");


        }
    }
}