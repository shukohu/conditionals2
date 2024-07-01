import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1
        System.out.println("Задача 1");

        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Переустановите OS");
        }

        //Задача 2
        System.out.println("Задача 2");


        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите новую версию приложения для Android по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите новую версию приложения для iOS по ссылке");
        }else{
            System.out.println("На вашем устройстве последняя версия приложения");
        }

        ///

        int clientDeviceYear1 = 2015;
        String msg = clientDeviceYear1 <= 2015 ? "облегченную " : "";
        String os = clientOs == 1 ? "Android" : "iOS";
        if (clientOs == 0 || clientOs == 1) {
            System.out.println("Установите " + msg + "версию приложения для " + os + " по ссылке");
        }else {
            System.out.println("Ошибка");
        }



        //Задача 3
        System.out.println("Задача 3");

        int year = 2021;
        if (year >=1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        //Задача 4
        System.out.println("Задача 4");



        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется сутки");
        }else if (deliveryDistance < 60){
            System.out.println("Потребуется 2 дня");
        }else if (deliveryDistance < 100){
            System.out.println("Потребуется 3 дня");
        }else{
            System.out.println("Доставки нет");
        }



        //Задача 5
        System.out.println("Задача 5");


        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }



    }
}



