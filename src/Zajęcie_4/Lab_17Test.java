package Zajęcie_4;

public class Lab_17Test {
    private Lab_17 direction;

    @Override
    public String toString() {
        return "Lab_17Test{" +
                "direction=" + direction +
                '}';
    }

    public Lab_17 getDirection() {
        return direction;

    }

    public void setDirection(Lab_17 direction) {
        this.direction = direction;
    }

    public Lab_17Test(Lab_17 direction) {
        this.direction = direction;

    }
}
