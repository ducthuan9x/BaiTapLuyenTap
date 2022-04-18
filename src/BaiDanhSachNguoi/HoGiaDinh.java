package BaiDanhSachNguoi;

import java.util.ArrayList;


public class HoGiaDinh implements Comparable<HoGiaDinh>{
    private final ArrayList<Nguoi>giaDinh = new ArrayList<>();
    private String diaChi;
    private int soThanhVien=0;


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



    public void add(Nguoi nguoi){

            this.giaDinh.add(nguoi);
             soThanhVien++;

    }
    public void display(){
        for(int i=0;i<giaDinh.size();i++){
            System.out.println(this.giaDinh.get(i).toString());
        }
        System.out.println("địa chỉ "+ getDiaChi()+ ", số thành viên "+ soThanhVien);

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
            soThanhVien--;
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




    @Override
    public int compareTo(HoGiaDinh o) {
        return this.getSoThanhVien()-o.getSoThanhVien();
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "giaDinh=" + giaDinh +
                ", diaChi='" + diaChi + '\'' +
                ", soThanhVien=" + soThanhVien +
                '}';
    }
}
