package BaiDanhSachNguoi;

import java.util.ArrayList;

public class HoGiaDinh {
    private ArrayList<Nguoi>giaDinh;
    private String diaChi;
    private int soThanhVien;

    public HoGiaDinh() {
        this.giaDinh=new ArrayList<Nguoi>();
    }

    public HoGiaDinh(ArrayList<Nguoi> giaDinh) {
        this.giaDinh = giaDinh;
    }

    public HoGiaDinh(ArrayList<Nguoi> giaDinh, String diaChi, int soThanhVien) {
        this.giaDinh = giaDinh;
        this.diaChi = diaChi;
        this.soThanhVien = soThanhVien;
    }



    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public void add(Nguoi nguoi){
        this.giaDinh.add(nguoi);
    }
    public void display(){
        for(int i=0;i<giaDinh.size();i++){
            System.out.println(this.giaDinh.get(i));
        }
        System.out.println("địa chỉ "+ diaChi+ "số thành viên "+ soThanhVien);

    }

    public int search(String soCmnd){
        for (int i=0;i<giaDinh.size();i++){
            if(giaDinh.get(i).getSoCmnd().equals(soCmnd)){
                return i;
            }
        }
        return -1;
    }
    public void edit(String soCmnd, Nguoi nguoi){
        int indexOfCmnd=search(soCmnd);
        if(indexOfCmnd==-1){
            System.out.println("ko có thành viên này");
        }
        else {
            giaDinh.set(indexOfCmnd,nguoi);
        }
    }
    public void delete(String soCmnd){
        int indexOfCmnd=search(soCmnd);
        if(indexOfCmnd==-1){
            System.out.println("ko có thành viên này");
        }
        else {
            giaDinh.remove(indexOfCmnd);
        }
    }
}
