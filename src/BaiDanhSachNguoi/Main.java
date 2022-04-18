package BaiDanhSachNguoi;

public class Main {
    public static void main(String[] args) {
        HoGiaDinh hoGiaDinh= new HoGiaDinh();
        hoGiaDinh.add(new Nguoi("hh", "0191222", "gv", 12));
        hoGiaDinh.setDiaChi("hà lội");
        hoGiaDinh.setSoThanhVien(4);
        hoGiaDinh.display();
        Nguoi nguoi1=new Nguoi("kk","123456","nd",15);
        Nguoi nguoi2=new Nguoi("lll","323456","hs",5);
        hoGiaDinh.add(nguoi2);
        hoGiaDinh.edit("0191222",nguoi1);

        hoGiaDinh.display();
        hoGiaDinh.delete("123456");
        hoGiaDinh.display();

    }
}
