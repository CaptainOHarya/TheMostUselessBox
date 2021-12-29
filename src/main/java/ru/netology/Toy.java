package ru.netology;

// Игрушка
public class Toy extends Thread {
    private Switcher switcher;
    private String toyName;
    private final int CONTROLTIME = 300; // 0,3 сек. на закрытие коробки

    public Toy(Switcher switcher, String toyName) {

        this.switcher = switcher;
        this.toyName = toyName;
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                if (switcher.isOpen) {
                    System.out.println("Персонаж " + toyName + " выключает тумблер и коробка закрывается");
                    Thread.sleep(CONTROLTIME);
                    switcher.closeBox();
                    System.out.println("Коробка закрыта");
                    System.out.println();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}



