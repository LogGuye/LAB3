package BAI2;

import java.util.Scanner;

public class PHANSO {
    int tu;
    int mau;

    public PHANSO() {
        tu = 0;
        mau = 1;
    }

    public PHANSO(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PHANSO(PHANSO p) {
        tu = p.tu;
        mau = p.mau;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tu = sc.nextInt();
        System.out.print("Nhập mẫu số: ");
        mau = sc.nextInt();
    }

    public void xuat() {
        System.out.println(tu + "/" + mau);
    }

    private int ucln(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private void rutgon() {
        int a = tu;
        int b = mau;
        int u = ucln(Math.abs(a), Math.abs(b));
        tu = tu / u;
        mau = mau / u;
    }

    public PHANSO cong(PHANSO p) {
        PHANSO kq = new PHANSO();
        kq.tu = tu * p.mau + p.tu * mau;
        kq.mau = mau * p.mau;
        kq.rutgon();
        return kq;
    }

    public PHANSO tru(PHANSO p) {
        PHANSO kq = new PHANSO();
        kq.tu = tu * p.mau - p.tu * mau;
        kq.mau = mau * p.mau;
        kq.rutgon();
        return kq;
    }

    public PHANSO nhan(PHANSO p) {
        PHANSO kq = new PHANSO();
        kq.tu = tu * p.tu;
        kq.mau = mau * p.mau;
        kq.rutgon();
        return kq;
    }

    public PHANSO chia(PHANSO p) {
        PHANSO kq = new PHANSO();
        kq.tu = tu * p.mau;
        kq.mau = mau * p.tu;
        kq.rutgon();
        return kq;
    }
}
