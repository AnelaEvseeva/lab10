package com.company;

public class Animal implements AnimalInterface {
    private double animalRun, animalJump, animalSwim;

    Animal(double animalRun, double animalJump, double animalSwim) {
        this.animalRun = animalRun;
        this.animalJump = animalJump;
        this.animalSwim = animalSwim;
    }

    @Override
    public boolean run(double value) {
        return animalRun > value;
    }

    @Override
    public boolean jump(double value) {
        return animalJump > value;
    }

    @Override
    public boolean swim(double value) {
        return animalSwim > value;
    }

    double getAnimalRun() {
        return animalRun;
    }

    double getAnimalJump() {
        return animalJump;
    }

    double getAnimalSwim() {
        return animalSwim;
    }
}