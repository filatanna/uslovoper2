public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
    }
    private static void task1(){
        System.out.println("Задача 1");
        int clientOs = 1;
        if ( clientOs ==1 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOs ==0) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        }
    }
    private static void  task2(){
        System.out.println("Задача 2");
        int clientOs = 1;
        int clientDeviceYear = 0;
        if ( clientOs ==1 && clientDeviceYear == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs ==1 && clientDeviceYear ==0) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOs ==0 && clientDeviceYear ==1) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        } else if (clientOs == 0 && clientDeviceYear ==0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
    }
    private  static void task3() {
        System.out.println("Задача 3");
        int year = 2050;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " високосный год");
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println( year + " год не является високосным");
        }
    }
    private  static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        if (deliveryDistance < 20){
            System.out.println(" Потребуется дней 1.");}
        else if (deliveryDistance >=20 && deliveryDistance <60) {
            System.out.println( "Потребуется 2 дня."); }
        else if (deliveryDistance >=60 && deliveryDistance <= 100){
            System.out.println("Потребуется 3 дня"); }
        else {
            System.out.println(" Нет доставки."); }

    }
    private static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 25;
        switch (monthNumber){
            case 1:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Принадлежит в сезону весна");
                break;
            case 4:
                System.out.println("Принадлежит в сезону весна");
                break;
            case 5:
                System.out.println("Принадлежит в сезону весна");
                break;
            case 6:
                System.out.println("Принадлежит в сезону лето");
                break;
            case 7:
                System.out.println("Принадлежит в сезону лето");
                break;
            case 8:
                System.out.println("Принадлежит в сезону лето");
                break;
            case 9:
                System.out.println("Принадлежит в сезону осень");
                break;
            case 10:
                System.out.println("Принадлежит в сезону осень");
                break;
            case 11:
                System.out.println("Принадлежит в сезону осень");
                break;
            case 12:
                System.out.println("Принадлежит в сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}