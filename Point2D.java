package bai3;
public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        x = 0;
        y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point2D cong(Point2D p) {
        return new Point2D(this.x + p.x, this.y + p.y);
    }

    public Point2D doiXungHoanh() {
        return new Point2D(this.x, -this.y);
    }

    public void xuatToaDo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}   

