package org.spaceappschallenge.models.wind;

public class Wind {

    private double speed;
    private Direction direction;

    public Wind() {}

    public Wind(double speed, Direction direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
