package BaiDanhSachNguoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class KhuPho {
    ArrayList<HoGiaDinh>hoGiaDinhs = new ArrayList<>();

    public KhuPho() {
    }

    public void addTown(HoGiaDinh hgd){
        this.hoGiaDinhs.add(hgd);
    }
    public void disPlayTown(){
        for (int i=0;i<hoGiaDinhs.size();i++){
            this.hoGiaDinhs.get(i).display();
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
            Collections.sort(this.hoGiaDinhs, new Comparator<HoGiaDinh>() {
                @Override
                public int compare(HoGiaDinh hoGiaDinh1, HoGiaDinh hoGiaDinh2) {
                    if(hoGiaDinh1.getSoThanhVien()>hoGiaDinh2.getSoThanhVien()){
                        return 1;
                    }
                    else if (hoGiaDinh1.getSoThanhVien()<hoGiaDinh2.getSoThanhVien()){
                        return -1;
                    }
                    else{
                        return 0;
                    }
                }
            });
        }
}
