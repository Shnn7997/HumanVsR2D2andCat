package org.example;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void jump(Human human) {
        human.jump(height);
    }

    public void jump(Cat cat) {
        cat.jump(height);
    }

    public void jump(Robot robot) {
        robot.jump(height);
    }
}