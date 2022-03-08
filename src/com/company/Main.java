package com.company;

public class Main {

    public static void main(String[] args) {
	int clientOS = 0;
    int clientDeviceYear = 2015;
    if (clientOS == 0 && clientDeviceYear >= 2015)
        System.out.println("Установите версию приложения для iOS по ссылке");
    else if (clientOS == 0 && clientDeviceYear < 2015)
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    else if (clientOS == 1 && clientDeviceYear >=2015)
        System.out.println("Установите версию приложения для Android по ссылке");
    else if (clientOS == 1 && clientDeviceYear < 2015)
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    else
        System.out.println("Ошибка");

    System.out.println("\n" + "Task 3");
    int year = 2024;
    if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 ==0))
        System.out.println(year + "год является високосным");
    else
        System.out.println(year + "год не является високосным");

        System.out.println("\n" + "Task 4");
        int deliveryDisrance = 5;
        if (deliveryDisrance < 20)
            System.out.println("Потребуется дней: " + 1);
        else if (deliveryDisrance >= 20 && deliveryDisrance < 60)
            System.out.println("Потребуется дней: " + 2);
        else  if (deliveryDisrance >=60 && deliveryDisrance < 100)
            System.out.println("Потребуется дней: " + 3);
        else
            System.out.println("Доставка не осуществляется");

        System.out.println("\n" + "Task 5");
        int mounthNumber = 883;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
        System.out.println("Winter");
        break;
            case 3:
            case 4:
            case 5:
        System.out.println("Spring");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println("Summer");
         break;
         case 9:
         case 10:
         case 11:
        System.out.println("Autumn");
         break;
            default:
                System.out.println("Error");


        }
    }
}
