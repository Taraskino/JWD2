package Kol;

public class Point extends Segment {
    @Override
    int startPoint() {
        return x1;

    }

    @Override
    int endPoint() {
        return x2;
    }
    int x1;
    int x2;
    int y1;
    int y2;

    public Point(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
}
