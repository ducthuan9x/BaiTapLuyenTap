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
        System.out.println("2 :sua thanh vien");
        System.out.println("3 :xoá theo cmnd");
        System.out.println("4 :tìm kiếm theo tên");
        System.out.println("5 :hiển thị người nhỏ tuổi nhất");

    }
    public void hienMenuPhoPhaHoai() {
        System.out.println("------------Quan Ly khu Phố------------");
        System.out.println("1 :Them thanh vien");
        System.out.println("2 :sua thanh vien");
        System.out.println("3 :xoá theo cmnd");
        System.out.println("4 :tìm kiếm theo tên");
        System.out.println("5 :hiển thị người nhỏ tuổi nhất");

    }
}
