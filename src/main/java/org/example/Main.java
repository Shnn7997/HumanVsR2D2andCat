package org.example;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Вася", 5000, 2);
        Cat cat = new Cat("Барсик", 1000, 3);
        Robot robot = new Robot("R2-D2", 10000, 1);

        Treadmill treadmill = new Treadmill(2000);
        Wall wall = new Wall(1);

        treadmill.run(human);
        treadmill.run(cat);
        treadmill.run(robot);

        wall.jump(human);
        wall.jump(cat);
        wall.jump(robot);
    }
}
