   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PHANSO p1 = new PHANSO();
        System.out.print("Phân số p1 ban đầu: ");
        p1.xuat();

        p1.nhap();
        System.out.print("Phân số p1 sau khi nhập: ");
        p1.xuat();

        PHANSO p2 = new PHANSO(4, 16);
        System.out.print("Phân số p2 : ");
        p2.xuat();

        System.out.println("Nhập phân số p3:");
        System.out.print("Tử số: ");
        int tu = sc.nextInt();
        System.out.print("Mẫu số: ");
        int mau = sc.nextInt();
        PHANSO p3 = new PHANSO(tu, mau);
        System.out.print("Phân số p3: ");
        p3.xuat();

        PHANSO p4 = p1.cong(p3);
        System.out.print("Tổng p1 + p3: ");
        p4.xuat();

        PHANSO p5 = p1.tru(p3);
        System.out.print("Hiệu p1 - p3: ");
        p5.xuat();

        PHANSO p6 = p1.nhan(p3);
        System.out.print("Tích p1 * p3: ");
        p6.xuat();
        System.out.println("Tính ƯCLN của hai số nguyên dương:");
        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        PHANSO tam = new PHANSO();
        tam.ucln(a, b);
    }