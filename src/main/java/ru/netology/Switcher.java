package ru.netology;

// Класс нашего тумблера
public class Switcher {

    // наша volatile-переменная, по умолчанию коробка закрыта
    volatile boolean isOpen = false;

    public void openBox() {
        isOpen = true;
    }

    public void closeBox() {
        isOpen = false;
    }
}
