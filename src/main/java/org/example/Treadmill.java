package org.example;

public class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void run(Human human) {
        human.run(length);
    }

    public void run(Cat cat) {
        cat.run(length);
    }

    public void run(Robot robot) {
        robot.run(length);
    }
}
