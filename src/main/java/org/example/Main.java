package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise;

        do {
            System.out.println("==================================================================");
            System.out.println(ANSI_CYAN + "Приветсвую тебя, Пользователь!" + ANSI_RESET);
            System.out.println("У Вас на выбор есть две программки:\n1. Проверка возраста\t\t\t\n2. Нахождение P - периметр, S - площадь, R - радиус \n3. Выход из меню");

            System.out.println("Выберите действие (1, 2 или 3): ");
            System.out.println("==================================================================");
            choise = scanner.nextInt();

            switch (choise) {

                case 1:
                    System.out.println("Введите пожалуйста свое имя: ");
                    String name = scanner.next();
                    System.out.println(ANSI_CYAN + "Приятно познакомиться, " + name + "!" + ANSI_RESET);

                    System.out.println("Теперь введите пожалуйста свою полную дату рождения: \n(В формате ГГГГ-ММ-ДД) : ");
                    String add_age = scanner.next();

                    LocalDate birthDate = LocalDate.parse(add_age);
                    LocalDate currentDate = LocalDate.now();

                    Period age = Period.between(birthDate, currentDate);
                    int years = age.getYears();

                    System.out.println("Супер! Получается Вам " + years);
                    if (years >= 18) {
                        System.out.println(ANSI_CYAN + "Вы уже взрослый!" + ANSI_RESET);
                        //System.out.println("==================================================================");
                    } else {
                        System.out.println(ANSI_CYAN + "Вы еще маленький!" + ANSI_RESET);
                        //System.out.println("==================================================================");
                    }
                    break;

                case 2:
                    System.out.println("Выберите что хотите найти (P - периметр, S - площадь, R - радиус)");
                    String choose = "";
                    int a, b; //c;
                    double r;
                    a = 0;
                    b = 0;
                    r = 0;
                    //c = 0;
                    choose = scanner.next();

                    if(Objects.equals(choose, "P")) {
                        System.out.println("Введите первое число: ");
                        a = scanner.nextInt();

                        System.out.println("Введите второе число: ");
                        b = scanner.nextInt();

                        System.out.print("Периметр прямоугольника равен:" + 2 * (a + b) + "!\n");

                    } else if (Objects.equals(choose, "S")) {
                        System.out.println("Введите первое число: ");
                        a = scanner.nextInt();

                        System.out.println("Введите второе число: ");
                        b = scanner.nextInt();

                        System.out.print("Площадь прямоугольника равна: " + a * b + "!\n");
                        
                    } else if (Objects.equals(choose, "R")) {
                        System.out.println("Введите диаметр окружности: ");
                        r = scanner.nextDouble();

                        System.out.print("Радиус окружности через диаметр равен: " + r/2  + "!\n");
                    }
            }
        }while (choise != 3);
    }
}