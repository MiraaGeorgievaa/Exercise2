package com.company;

public class Main {

    public static void main(String[] args) {
	AnimalHouse<Penguin> penguinHouse;
    AnimalHouse<Bird> birdHouse;

    Penguin penguin= new Penguin("");
    Bird bird= new Bird(4);

    penguinHouse= new AnimalHouse<>(penguin);
    birdHouse= new AnimalHouse<>(bird);
    System.out.println("Penguin's name: "+ penguin.name);
        System.out.println("Bird's height of flight: "+ bird.highOfFlight);
    }
}
