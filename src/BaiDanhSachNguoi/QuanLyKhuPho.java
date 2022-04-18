package BaiDanhSachNguoi;

public class QuanLyKhuPho {
    private KhuPho khupho;

    public QuanLyKhuPho() {
    }

    public QuanLyKhuPho(KhuPho khupho) {
        this.khupho = khupho;
    }

    public void hienMenuKhuPho() {
        System.out.println("------------Quan Ly Khu Pho------------");
        System.out.println("1 :Hộ gia đình");
        System.out.println("2 :Khu phố");
        System.out.println("0 :thoát khỏi menu");
    }
    public void hienMenuGiaDinh() {
        System.out.println("------------Quan Ly Gia Dinh------------");
        System.out.println("1 :Them thanh vien");
        System.out.println("2 :Xoa thanh vien");
        System.out.println("3 :thoát khỏi menu");
    }
}
