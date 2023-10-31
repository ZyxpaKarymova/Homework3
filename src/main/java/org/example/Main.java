package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Задача 1*/
        int varInt = 2_147_483_646;
        byte varByte = -127;
        short varShort = 32_767;
        long varLong = 922_337_036_854_775_807L;
        float varFloat = 3.1f;
        double varDouble = 1.7E+308;
        System.out.println("Задача 1");
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);

        /*Задача 2*/
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        int d = 569;
        int e = -159;
        int f = 27897;
        byte g = 67;

        /*Задача 3*/
        System.out.println("Задача 3");
        int studentsLp = 23; //У Людмилы Павловны — 23 ученика
        int studentsAS = 27; //у Анны Сергеевны — 27 учеников
        int StudentsEa = 30; //у Екатерины Андреевны — 30 учеников
        int paperCommon = 480; //Три учительницы закупили все вместе 480 листов бумаги
        int paperStudent = paperCommon / (studentsLp + studentsAS + StudentsEa);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги.");

        /*Задача 4*/
        System.out.println("Задача 4");
        int time = 2; //минуты
        int quantity = 16;//бутылок
        int productivity = quantity / time; //производительность бутылок в минуту
        int productivity20min = productivity * 20;
        int productivityDay = productivity * 60 * 24;
        int productivity3Day = productivity * 60 * 24 * 3;
        int productivityMonth = productivity * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + productivity20min + " штук бутылок.");
        System.out.println("За сутки  машина произвела " + productivityDay + " штук бутылок.");
        System.out.println("За 3 дня  машина произвела " + productivity3Day + " штук бутылок.");
        System.out.println("За 1 месяц  машина произвела " + productivityMonth + " штук бутылок.");

        /*Задача 5*/
        System.out.println("Задача 5");
        int paintPins = 120;//На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой
        int white1class = 2; //На один класс уходит 2 банки белой
        int marron1class = 4; //4 банки коричневой краски.
        int classes = paintPins / (white1class + marron1class);
        int paintWihte = classes * white1class;
        int paintMarron = classes * marron1class;
        System.out.println("В школе, где " + classes + " классов, нужно " + paintWihte + " банок белой краски и " + paintMarron + " банок коричневой краски.");

        /*Задача 6*/
        System.out.println("Задача 6");
    /*Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
    Вот один из рецептов, по которому спортсмен готовит себе завтрак:
    Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.
    Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.  Результат в граммах и килограммах напечатайте в консоль.*/
        int bananaQuantity = 5;
        float milkQuantity = 200; //мл
        int icecreamQuantity = 2;
        int eggsQuantity = 4;
        int bananaWeight = 80;
        float milkWeight = (float) 105 / 100; //в грамм на миллилитр;
        int icecreamWeight = 100;
        int eggsWeight = 70;
        float WeightGramms = (bananaQuantity * bananaWeight + milkQuantity * milkWeight + icecreamQuantity * icecreamWeight + eggsQuantity * eggsWeight);
        float WeightKilos = WeightGramms / 1000;
        System.out.println("Вес завтрака в граммах " + WeightGramms);
        System.out.println("Вес завтрака в килограммах " + WeightKilos);

        /*Задача 7*/
        System.out.println("Задача 7");
    /*Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
      Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
      Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
      Результаты всех подсчетов выведите в консоль*/
        float weightTolost = 7000;
        float lost1 = 250;
        float lost2 = 500;
        float days1 = weightTolost / lost1;
        float days2 = weightTolost / lost2;
        float daysAverage = weightTolost / ((lost1 + lost2) / 2);
        System.out.println(days1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + lost1 + " грамм.");
        System.out.println(days2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + lost2 + " грамм.");
        System.out.println(daysAverage + " дней уйдет на похудение в среднем.");


        /*Задача 8*/
        System.out.println("Задача 8");
    /*Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
    Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
    К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
    Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
    Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
    Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».*/
        int salaryMaria = 67_760;
        int salaryDenis = 83_690;
        int salaryChristina = 76_230;
        float yearMaria = salaryMaria * 12;
        float yearDenis = salaryDenis * 12;
        float yearChristina = salaryChristina * 12;

        float salaryMaria2 = (float) (salaryMaria * 1.1);
        float salaryDenis2 = (float) (salaryDenis * 1.1);
        float salaryChristina2 = (float) (salaryChristina * 1.1);

        float yearMaria2 = salaryMaria2 * 12;
        float yearDenis2 = salaryDenis2 * 12;
        float yearChristina2 = salaryChristina2 * 12;

        float growthMaria = yearMaria2 - yearMaria;
        float growthDenis = yearDenis2 - yearDenis;
        float growthChristina = yearChristina2 - yearChristina;


        System.out.println("Маша теперь получает " + salaryMaria2 + " рублей. Годовой доход вырос на " + growthMaria + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis2 + " рублей. Годовой доход вырос на " + growthDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryChristina2 + " рублей. Годовой доход вырос на " + growthChristina + " рублей");

    }
}