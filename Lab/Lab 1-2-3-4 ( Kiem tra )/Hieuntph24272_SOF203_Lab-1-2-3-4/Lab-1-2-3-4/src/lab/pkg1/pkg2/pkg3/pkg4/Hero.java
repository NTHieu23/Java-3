/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg1.pkg2.pkg3.pkg4;

/**
 *
 * @author tdahi
 */
public class Hero {
    private String ten;
    private int sucManh;
    private String vaiTro;
    private boolean gioiTinh;

    public Hero() {
    }

    public Hero(String ten, int sucManh, String vaiTro, boolean gioiTinh) {
        this.ten = ten;
        this.sucManh = sucManh;
        this.vaiTro = vaiTro;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSucManh() {
        return sucManh;
    }

    public void setSucManh(int sucManh) {
        this.sucManh = sucManh;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    
}
