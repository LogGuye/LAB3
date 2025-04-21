    public static void main(String[] args) {
        NHANVIEN nv1 = new NHANVIEN();
        NHANVIEN nv2 = new NHANVIEN("nv02", "nguyen van b", 1500, 2.5);
        NHANVIEN nv3 = new NHANVIEN(nv2);
        nv3.sethoten("le thi c");

        System.out.println("== 3 nhan vien khoi tao khac nhau ==");
        nv1.nhap();
        nv1.xuat();
        nv2.xuat();
        nv3.xuat();

        System.out.println("== nhap danh sach nhan vien ==");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        NHANVIEN[] ds = new NHANVIEN[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhan vien " + (i + 1));
            ds[i] = new NHANVIEN();
            ds[i].nhap();
        }

        System.out.println("== xuat danh sach nhan vien ==");
        for (NHANVIEN nv : ds) {
            nv.xuat();
        }

        double maxhe = ds[0].gethesoluong();
        String tenmax = ds[0].gethoten();
        for (NHANVIEN nv : ds) {
            if (nv.gethesoluong() > maxhe) {
                maxhe = nv.gethesoluong();
                tenmax = nv.gethoten();
            }
        }
        System.out.println("nhan vien co he so luong cao nhat: " + tenmax);

        ds[0].sethoten("ten moi nhan vien 1");
        System.out.println("ten nhan vien dau tien sau khi doi:");
        ds[0].xuat();

        System.out.println("tong so nhan vien: " + NHANVIEN.getsoluongnv());
    }