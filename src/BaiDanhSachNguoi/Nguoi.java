package BaiDanhSachNguoi;

public class Nguoi {
    private String ten,soCmnd,nghe;
    private int tuoi;

    public Nguoi() {
    }

    public Nguoi(String ten, String soCmnd, String nghe, int tuoi) {
        this.ten = ten;
        this.soCmnd = soCmnd;
        this.nghe = nghe;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getNghe() {
        return nghe;
    }

    public void setNghe(String nghe) {
        this.nghe = nghe;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return
                "ten='" + ten + '\'' +
                ", soCmnd='" + soCmnd + '\'' +
                ", nghe='" + nghe + '\'' +
                ", tuoi=" + tuoi;
    }
}
