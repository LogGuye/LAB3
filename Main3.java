    public static void main(String[] args) {
    Point2D p1 = new Point2D(2, 5);
    Point2D p2 = new Point2D(3, -4);

    System.out.print("Điểm 1: ");
    p1.xuatToaDo();

    System.out.print("Điểm 2: ");
    p2.xuatToaDo();

    Point2D tong = p1.cong(p2);
    System.out.print("Tổng: ");
    tong.xuatToaDo();

    Point2D dx = p1.doiXungHoanh();
    System.out.print("Điểm đối xứng p1 qua trục hoành: ");
    dx.xuatToaDo();
}