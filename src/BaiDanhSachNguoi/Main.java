package BaiDanhSachNguoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyKhuPho qlkp = new QuanLyKhuPho();

        HoGiaDinh hoGiaDinh = new HoGiaDinh();
        KhuPho khuPho = new KhuPho();

        Scanner scanner = new Scanner(System.in);
        qlkp.hienMenuKhuPho();
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            qlkp.hienMenuGiaDinh();

            int choice1 = scanner.nextInt();
            scanner.nextLine();

            if (choice1 == 3) {
                qlkp.hienMenuKhuPho();
            } else if (choice1 == 1) {
                System.out.println("nhâp tên thành viên");
                String ten = scanner.nextLine();
                System.out.println("nhâp số cmnd");
                String soCmnd = scanner.nextLine();
                System.out.println("nhâp nghề nghiệp thành viên");
                String nghe = scanner.nextLine();
                System.out.println("nhâp tuổi thành viên");
                int tuoi = scanner.nextInt();
                System.out.println("nhâp địa chỉ thành viên");
                String diaChi = scanner.nextLine();
                System.out.println("nhâp số thành viên");
                int soThanhVien = scanner.nextInt();
            }
        } else {
            System.exit(0);
        }


//        hoGiaDinh.add(new Nguoi("hh", "0191222", "gv", 12));
//        hoGiaDinh.setDiaChi("hà lội");
//        hoGiaDinh.setSoThanhVien(4);
//        hoGiaDinh.display();
//        Nguoi nguoi1=new Nguoi("kk","123456","nd",15);
//        Nguoi nguoi2=new Nguoi("lll","323456","hs",5);
//        Nguoi nguoi3= new Nguoi("dd","sv1235","sv",6);
//        hoGiaDinh.add(nguoi2);
//        hoGiaDinh.edit("0191222",nguoi1);
//
//        hoGiaDinh.ageMin();
//        hoGiaDinh.display();
//        hoGiaDinh.delete("123456");
//        hoGiaDinh.display();


//
//        HoGiaDinh hoGiaDinh1=new HoGiaDinh("ha noi", 3);
//        hoGiaDinh1.add(nguoi1);
//        HoGiaDinh hoGiaDinh2= new HoGiaDinh("ha nam", 5);
//        hoGiaDinh2.add(nguoi2);
//        HoGiaDinh hoGiaDinh3=new HoGiaDinh("thanh hoa",8);
//        hoGiaDinh3.add(nguoi3);
//
//        KhuPho khuPho=new KhuPho();
//        khuPho.addTown(hoGiaDinh1);
//        khuPho.addTown(hoGiaDinh2);
//        khuPho.addTown(hoGiaDinh3);
//        khuPho.editTown("ha noi",hoGiaDinh3);
//        khuPho.disPlayTown();
    }
}

