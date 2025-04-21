
package bai1;
import java.util.Scanner;
public class HOCSINH {
    private int MASO;
    private String HOTEN;
    private float DTB;
    public int getMASO(){
       return MASO;
    }
    public void setMASO(int MASO){
        this.MASO=MASO;
    }
    public String getHOTEN(){
        return HOTEN;
    }
    public void setHOTEN(String HOTEN){
       this.HOTEN=HOTEN;
    }
    public float getDTB(){
        return DTB;
    }
    public void setDTB(float DTB){
        this.DTB=DTB;
    }
    public HOCSINH(){
        this.MASO=0;
        this.HOTEN=null;
        this.DTB=0;
    }
    public HOCSINH(int MASO,String HOTEN, float DTB){
        this.MASO=MASO;
        this.HOTEN=HOTEN;
        this.DTB=DTB;
    }
    public HOCSINH(HOCSINH tmp){
        this.MASO=tmp.MASO;
        this.HOTEN=tmp.HOTEN;
        this.DTB=tmp.DTB;
    }
    public void nhapthongtin(){
        Scanner nhap=new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        MASO=nhap.nextInt();
        nhap.nextLine();
        System.out.print("Nhap ho ten: ");
        HOTEN=nhap.nextLine();
        System.out.print("Nhap diem trung binh: ");
        DTB=nhap.nextFloat();
    }
    public void xuatthongtin(){
        System.out.println(MASO+"-"+HOTEN+"-"+DTB+"-");
    }
     public class Demo1{
    public static void main(String[] args) {
      HOCSINH HS1= new HOCSINH();
      HS1.nhapthongtin();
      HS1.xuatthongtin();
      HOCSINH HS2= new HOCSINH(1250080066,"Nguyen Tram Huong",8);
      HS2.xuatthongtin();
      HOCSINH HS3= new HOCSINH(HS2);
      HS3.setHOTEN("Nguyen Thanh Nhu Thuy");
      HS3.xuatthongtin();
      float max=HS1.getDTB();
      String HT=HS1.getHOTEN();
      if(max<HS2.getDTB()){
          max=HS2.getDTB();
          HT= HS2.getHOTEN();
      }
      if(max <HS3.getDTB()){
        max=HS3.getDTB();
        HT= HS3.getHOTEN();  
      }
    System.out.println("Hoc sinh "+ HT +"co diem trung binh lon nhat la: "+max);
    }
     }
    public static class Danhsach{
       private HOCSINH DS[];
       private int SOLUONG;
       public void nhapDS(){
        Scanner nhapsoluong= new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        SOLUONG= nhapsoluong.nextInt();
        nhapsoluong.nextLine();
        DS=new HOCSINH[SOLUONG];
        for (int i = 0; i < SOLUONG; i++) {
          DS[i]=new HOCSINH();
          DS[i].nhapthongtin();
        }
    }
        public void xuatDS(){
        System.out.println("Danh sach hoc sinh la: ");
        for(int i =0; i< SOLUONG;i++)
            DS[i].xuatthongtin();
    }
    
public void sapxep() {
    for (int i = 0; i < SOLUONG - 1; i++) {
        for (int j = i + 1; j < SOLUONG; j++) {
            if (DS[i].getDTB() < DS[j].getDTB()) {
                HOCSINH temp = DS[i];
                DS[i] = DS[j];
                DS[j] = temp;
            }
        }
    }
}
    }
public class Demo2 {
    public static void main(String[] args) {
       Danhsach danhsach=new Danhsach();
        danhsach.nhapDS();
        danhsach.xuatDS();
        danhsach.sapxep();    
    }
}
}
     
    
    

