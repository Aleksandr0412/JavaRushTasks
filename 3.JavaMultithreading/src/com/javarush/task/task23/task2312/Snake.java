package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        this.sections.add(new SnakeSection(x, y));
        this.isAlive = true;
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getX() {
        return getSections().get(0).getX();
    }

    public int getY() {
        return getSections().get(0).getY();
    }

    public void move() {
        if (this.isAlive()) {
            if (this.direction == (SnakeDirection.UP)) move(0, -1);
            if (this.direction == SnakeDirection.RIGHT) move(1, 0);
            if (this.direction == SnakeDirection.DOWN) move(0, 1);
            if (this.direction == SnakeDirection.LEFT) move(-1, 0);

        }
    }

    public void move(int x, int y) {

    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }


}
