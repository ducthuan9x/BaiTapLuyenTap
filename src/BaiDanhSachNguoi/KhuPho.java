package BaiDanhSachNguoi;

import java.util.ArrayList;
import java.util.Collections;


public class KhuPho extends HoGiaDinh {
    ArrayList<HoGiaDinh>hoGiaDinhs = new ArrayList<>();

    public KhuPho() {
    }

    public void addTown(HoGiaDinh hgd){
        this.hoGiaDinhs.add(hgd);
    }
    public void disPlayTown(){
        for (int i=0;i<hoGiaDinhs.size();i++){
            System.out.println( this.hoGiaDinhs.get(i).toString());
        }
    }
    public int seachTown(String diaChi){
        for (int i=0;i<hoGiaDinhs.size();i++){
            if(hoGiaDinhs.get(i).getDiaChi().equals(diaChi)){
                return (i);
            }
        }
        return -1;
    }
    public void editTown(String diaChi,HoGiaDinh hgd){
        int indexOfTown=seachTown(diaChi);
        if(indexOfTown==-1){
            System.out.println("ko có hộ gia đình này");
        }
        else{
            hoGiaDinhs.set(indexOfTown,hgd);
        }
    }
    public void deleteTown(String diaChi){
        int indexOfTown=seachTown(diaChi);
        if(indexOfTown==-1){
            System.out.println("ko có hộ gia đình này");
        }
        else{
            hoGiaDinhs.remove(indexOfTown);
        }
    }
    public void maxMenber(){
        int max=hoGiaDinhs.get(0).getSoThanhVien();
        for(int i=0;i<hoGiaDinhs.size();i++){
            if(max<hoGiaDinhs.get(i).getSoThanhVien()){
                max=hoGiaDinhs.get(i).getSoThanhVien();
            }
        }
        System.out.println("hộ gia đình có số thành viên nhiều nhất "+max);
    }

        public void agemin() {
            Collections.sort(hoGiaDinhs);
        }
}
