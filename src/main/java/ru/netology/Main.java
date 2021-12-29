package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Switcher switcher = new Switcher();

        // Создаём и стартуем
        Thread player = new User(switcher, "Марина Тундра");
        Thread toy = new Toy(switcher, "Игрушка Тигрёнок");
        toy.start();
        player.start();
        // Останавливаем поток пользователя
        player.join();
        // Прерываем выполнение потока Игрушка
        toy.interrupt();
   }
}
