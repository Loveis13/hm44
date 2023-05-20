public class Main {
    public static void main(String[] args) {

        /// task1

        int clientOS =0 ;
        if (clientOS >=1){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS <= 0) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }

        /// task 2
        int clientDeviceYear =2012 ;
        if (clientDeviceYear >=2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2015) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        }

        ///task3

        int year = 2025;
        if (year%4 == 0 || year%400 == 0 && year%100 !=0){
            System.out.println( year + " год является высокостным ");
        }else {
            System.out.println(year + " год не является высокостным ");
        }

        /// task 4

        int delivery = 200;
        int day_1 = 1;
        int day_2 = 2;
        int day_3 = 3;
        if (delivery <20){
            System.out.println(" Потребуется дней " + day_1);
        } else if (delivery >20 && delivery<60) {
            System.out.println(" Потребуется дней " + day_2);
        } else if (delivery > 60 && delivery<100) {
            System.out.println("Потребуется дней " + day_3);
        } else if (delivery > 100) {
            System.out.println(" Доставки нет");
        }


        /// task5
        int  monthNumber= 2;

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