package org.example.app;

import org.example.animal.Animal;
import org.example.animal.Dog;
import org.example.animal.Fish;
import org.example.behaviors.Walkable;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        ((Walkable) dog).walk();  // OK

        fish.makeSound();
        // Fish no camina → no se llama walk(), no hay excepciones
    }
}

