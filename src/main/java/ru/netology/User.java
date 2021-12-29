package ru.netology;

// Пользователь

public class User extends Thread {
    private Switcher switcher;
    private String playerName;
    private final int NUMBEROFITERATION = 10; // количество игр пользователя
    private final int NUMBEROFSECONDS = 5000; // Пользователь раз в 5 секунд включает тумблер

    public User(Switcher switcher, String playerName) {
        this.switcher = switcher;
        this.playerName = playerName;
    }

    // Пользователь включает тумблер
    public void run() {
        try {
            for (int i = 0; i < NUMBEROFITERATION; i++) {
                System.out.println(playerName + " включил тумблер - коробка открылась");
                switcher.openBox();
                Thread.sleep(NUMBEROFSECONDS);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.err.printf("Игрок %s закончил игру\n", playerName);
        }

    }
}
