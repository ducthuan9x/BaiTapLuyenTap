package BaiDanhSachNguoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class HoGiaDinh {
    private final ArrayList<Nguoi>giaDinh = new ArrayList<>();
    private String diaChi;
    private int soThanhVien;
    private int count=0;

    public HoGiaDinh() {

    }
    public HoGiaDinh(String diaChi, int soThanhVien) {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add(Nguoi nguoi){

            this.giaDinh.add(nguoi);
             count++;

    }
    public void display(){
        for(int i=0;i<giaDinh.size();i++){
            System.out.println(this.giaDinh.get(i));
        }
        System.out.println("địa chỉ "+ diaChi+ " số thành viên "+ soThanhVien);

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
    public int seachName(String ten) {
        for (int i = 0; i < giaDinh.size(); i++) {
            if (this.giaDinh.get(i).getTen().equals(ten)) {
                return i;
            }
        }
        return -1;
    }
    public void ageMin(){
     int min= giaDinh.get(0).getTuoi();
        for(int i=0; i<giaDinh.size();i++){
            if(giaDinh.get(i).getTuoi()<min){
               min=giaDinh.get(i).getTuoi();
            }
        }
        System.out.println("thành viên nhỏ tuổi nhất "+ min);
    }

//    public void agemin(){
//        Collections.sort(this.giaDinh, new Comparator<Nguoi>() {
//            @Override
//            public int compare(Nguoi nguoi1, Nguoi nguoi2) {
//                if(nguoi1.getTuoi()<nguoi2.getTuoi()){
//                    return -1;
//                }
//                else if(nguoi1.getTuoi()>nguoi2.getTuoi()){
//                    return 1;
//                }
//                else{
//                    return 0;
//                }
//            }
//        });
//    }

}
