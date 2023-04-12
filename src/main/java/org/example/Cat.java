package org.example;

public class Cat {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean isPassed; // флаг для отслеживания прохождения предыдущего испытания

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.isPassed = true; // изначально флаг равен true, потому что участник еще не проходил испытания
    }

    public boolean run(int distance) {
        if (!isPassed) { // если предыдущее испытание не пройдено, то текущее испытание не выполняется
            return false;
        }
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
            isPassed = true; // устанавливаем флаг в true, если испытание пройдено успешно
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
            isPassed = false; // устанавливаем флаг в false, если испытание не пройдено
            return false;
        }
    }

    public boolean jump(int height) {
        if (!isPassed) { // если предыдущее испытание не пройдено, то текущее испытание не выполняется
            return false;
        }
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену высотой " + height + " метров");
            isPassed = true; // устанавливаем флаг в true, если испытание пройдено успешно
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метров");
            isPassed = false; // устанавливаем флаг в false, если испытание не пройдено
            return false;
        }
    }
}