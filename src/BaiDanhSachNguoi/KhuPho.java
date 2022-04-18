package BaiDanhSachNguoi;

import java.util.ArrayList;

public class KhuPho {
    private ArrayList<HoGiaDinh>hoGiaDinhs;

    public KhuPho() {
        this.hoGiaDinhs=new ArrayList<HoGiaDinh>();
    }

    public KhuPho(ArrayList<HoGiaDinh> hoGiaDinhs) {
        this.hoGiaDinhs = hoGiaDinhs;
    }
    public void add(HoGiaDinh hgd){
        this.hoGiaDinhs.add(hgd);
    }
    public void disPlay(){
        for (int i=0;i<hoGiaDinhs.size();i++){
            System.out.println(this.hoGiaDinhs.get(i));
        }
    }

}
