/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author tdahi
 */
public class HocVien {
     private String hoTen;
    private double diem;
    private String khoaHoc;

    public HocVien() {
    }

    public HocVien(String hoTen, double diem, String khoaHoc) {
        this.hoTen = hoTen;
        this.diem = diem;
        this.khoaHoc = khoaHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String xepLoai() {
        if (diem < 3) {
            return "Kém";
        }
        if (diem < 5) {
            return "Yếu";
        }
        if (diem < 6.5) {
            return "Trung Bình";
        }
        if (diem < 7.5) {
            return "Khá";
        }
        if (diem < 9) {
            return "Giỏi";
        }
        return "Xuất Sắc";
    }

    public boolean isThuong() {
        return diem >= 7.5;
    }
}
