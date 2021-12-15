package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        double Run=Math.random()*500;
        double Jump=Math.random()*3;
        double Swim=Math.random()*0;
        Cat cat = new Cat(Run, Jump, Swim);

        Run=Math.random()*1000;
        Jump=Math.random()*2;
        Swim=Math.random()*100;
        Animal dog = new Dog(Run, Jump, Swim);

        System.out.println("Кошка пробегает: "+cat.getAnimalRun()+"м. \nСобака пробегает: "+dog.getAnimalRun()+" м.");

        System.out.println("Введите дистанцию для бега: ");
        double distance = scanner.nextDouble();

        System.out.println("Кошка пытается перебежать "+distance+" м. Результат: "+cat.run(distance));
        System.out.println("Собака пытается перебежать "+distance+" м. Результат: "+dog.run(distance));

        System.out.println("Кошка может прыгнуть: " + cat.getAnimalJump() + " м. \nСобака может прыгнуть: " + dog.getAnimalJump() + " м.");

        System.out.println("Введите высоту припятствия: ");
        distance = scanner.nextDouble();

        System.out.println("Кошка пытается перепрыгнуть "+distance+" м. Результат: "+cat.jump(distance));
        System.out.println("Собака пытается перепрыгнуть "+distance+" м. Результат: "+dog.jump(distance));

        System.out.println("Кошка может проплыть: " + cat.getAnimalSwim() +
                " м. \nСобака может проплыть: " + dog.getAnimalSwim() + " м.");

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка пытается проплыть " + distance + " м. Результат: " + cat.swim(distance));
        System.out.println("Собака пытается проплыть " + distance + " м. Результат: " + dog.swim(distance));

    }


}

