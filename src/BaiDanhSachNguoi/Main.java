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
        Scanner sc = new Scanner(System.in);
        qlkp.hienMenuKhuPho();
        int choice = 0;
        choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            qlkp.hienMenuGiaDinh();
        } else if (choice == 2) {
            qlkp.hienMenuPhoPhaHoai();
        } else {
            System.exit(0);
        }
        int choice1 = 0;
        int choice2 = 0;
        do {
            choice1 = scanner.nextInt();
            scanner.nextLine();
            if (choice1 == 1) {
//                thêm thành viên
                System.out.println("nhâp tên thành viên");
                String ten = sc.nextLine();
                System.out.println("nhâp số cmnd");
                String soCmnd = sc.nextLine();
                System.out.println("nhâp nghề nghiệp thành viên");
                String nghe = sc.nextLine();
                System.out.println("nhâp tuổi thành viên");
                int tuoi = scanner.nextInt();
                System.out.println("nhâp địa chỉ thành viên");
                String diaChi = sc.nextLine();
                hoGiaDinh.add(new Nguoi(ten, soCmnd, nghe, tuoi));
                hoGiaDinh.setDiaChi(diaChi);
                hoGiaDinh.display();
            } else if (choice1 == 2) {
//                 sửa thành viên
                System.out.println("nhâp số cmnd ");
                String soCmnd1 = sc.nextLine();
                System.out.println("nhâp tên thành viên");
                String ten = sc.nextLine();
                System.out.println("nhâp số cmnd");
                String soCmnd = sc.nextLine();
                System.out.println("nhâp nghề nghiệp thành viên");
                String nghe = sc.nextLine();
                System.out.println("nhâp tuổi thành viên");
                int tuoi = scanner.nextInt();
                System.out.println("nhâp địa chỉ thành viên");
                String diaChi = sc.nextLine();
                Nguoi nguoi1 = new Nguoi(ten, soCmnd, nghe, tuoi);
                hoGiaDinh.setDiaChi(diaChi);
                hoGiaDinh.edit(soCmnd1, nguoi1);
                hoGiaDinh.display();
            } else if (choice1 == 3) {
//         xoá thành viên theo số cmnd
                System.out.println("nhâp số cmnd ");
                String soCmnd1 = sc.nextLine();
                hoGiaDinh.delete(soCmnd1);
                hoGiaDinh.display();
            } else if (choice1 == 4) {
//              tìm kiếm theo tên
                System.out.println("nhâp tên thành viên");
                String ten = sc.nextLine();
                hoGiaDinh.seachName(ten);
                hoGiaDinh.display();
            } else if (choice1 == 5) {
//               hiển thị người nhỏ tuổi nhất
                hoGiaDinh.ageMin();
            }
            else if(choice1==6) {
                qlkp.hienMenuKhuPho();
            }
            else {
                System.exit(0);
            }
        } while (choice1 != 0);
        do {
            choice2 = scanner.nextInt();
            scanner.nextLine();

            if (choice2 == 1) {
//                thêm thành viên
                System.out.println("nhâp tên thành viên");
                String ten = sc.nextLine();
                System.out.println("nhâp số cmnd");
                String soCmnd = sc.nextLine();
                System.out.println("nhâp nghề nghiệp thành viên");
                String nghe = sc.nextLine();
                System.out.println("nhâp tuổi thành viên");
                int tuoi = scanner.nextInt();
                System.out.println("nhâp địa chỉ thành viên");
                String diaChi = sc.nextLine();
                hoGiaDinh.add(new Nguoi(ten, soCmnd, nghe, tuoi));
                hoGiaDinh.setDiaChi(diaChi);
                khuPho.addTown(hoGiaDinh);
                khuPho.disPlayTown();
            } else if (choice2 == 2) {
//                 sửa thành viên
                System.out.println("nhâp số cmnd ");
                String soCmnd1 = sc.nextLine();
                System.out.println("nhâp tên thành viên");
                String ten = sc.nextLine();
                System.out.println("nhâp số cmnd");
                String soCmnd = sc.nextLine();
                System.out.println("nhâp nghề nghiệp thành viên");
                String nghe = sc.nextLine();
                System.out.println("nhâp tuổi thành viên");
                int tuoi = scanner.nextInt();
                System.out.println("nhâp địa chỉ thành viên");
                String diaChi = sc.nextLine();
                hoGiaDinh.add(new Nguoi(ten, soCmnd, nghe, tuoi));
                hoGiaDinh.setDiaChi(diaChi);
                khuPho.editTown(soCmnd,hoGiaDinh);
            }
            else if(choice2==3){
//         xoá thành viên theo số cmnd
                System.out.println("nhâp số cmnd ");
                String soCmnd1 = sc.nextLine();
                khuPho.deleteTown(soCmnd1);
                khuPho.disPlayTown();
            }
            else if(choice2==4){
//              tìm kiếm theo dia chi
                System.out.println("nhâp tên thành viên");
                String diaChi = sc.nextLine();
                khuPho.seachTown(diaChi);
                hoGiaDinh.display();
            }else if(choice2==5){
//               hiển thị ho gia dinh co nhieu thanh vien
                khuPho.maxMenber();
            }else if(choice2==6){
//      sap xep tuoi
                khuPho.agemin();
                khuPho.disPlayTown();
            }
            }
            while (choice2 != 0) ;



        }
    }

