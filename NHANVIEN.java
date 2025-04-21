package bai4;

import java.util.Scanner;

public class NHANVIEN {
    private String maso;
    private String hoten;
    private double luongcoban;
    private double hesoluong;
    private static int soluongnv = 0;

    public NHANVIEN() {
        maso = "";
        hoten = "";
        luongcoban = 0;
        hesoluong = 0;
        soluongnv++;
    }

    public NHANVIEN(String maso, String hoten, double luongcoban, double hesoluong) {
        this.maso = maso;
        this.hoten = hoten;
        this.luongcoban = luongcoban;
        this.hesoluong = hesoluong;
        soluongnv++;
    }

    public NHANVIEN(NHANVIEN nv) {
        this.maso = nv.maso;
        this.hoten = nv.hoten;
        this.luongcoban = nv.luongcoban;
        this.hesoluong = nv.hesoluong;
        soluongnv++;
    }

    public String getmaso() {
        return maso;
    }

    public String gethoten() {
        return hoten;
    }

    public double gethesoluong() {
        return hesoluong;
    }

    public void setmaso(String maso) {
        this.maso = maso;
    }

    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public void sethesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma so: ");
        maso = sc.nextLine();
        System.out.print("nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.print("nhap luong co ban: ");
        luongcoban = sc.nextDouble();
        System.out.print("nhap he so luong: ");
        hesoluong = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("ma: " + maso + ", ten: " + hoten + ", lcb: " + luongcoban + ", he so: " + hesoluong + ", luong: " + tinhluong());
    }

    public double tinhluong() {
        return luongcoban * hesoluong;
    }

    public static int getsoluongnv() {
        return soluongnv;
    }


}

    
