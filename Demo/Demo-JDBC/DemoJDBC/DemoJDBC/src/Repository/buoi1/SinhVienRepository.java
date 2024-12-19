/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.buoi1;

import Connection.buoi1.DBConnection;
import Model.buoi1.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tdahi
 */
public class SinhVienRepository {

    private ArrayList<SinhVien> list;
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public ArrayList<SinhVien> getAll() {
        list = new ArrayList<>();
        try {
            conn = DBConnection.getConnection();
            String sql = "SELECT * FROM SinhVien";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            list.clear();

            while (rs.next()) {
                String maSV = rs.getString(1);
                String hoTen = rs.getString(2);
                double diemTB = rs.getDouble(3);
                boolean gioiTinh = rs.getBoolean(4);

                list.add(new SinhVien(maSV, hoTen, diemTB, gioiTinh));

            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public boolean add(SinhVien sv) {
        try {
            conn = DBConnection.getConnection();
            String sql = "INSERT INTO SinhVien ([MaSV], [HoTen], [DiemTB], [GioiTinh]) VALUES (?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getHoTen());
            ps.setDouble(3, sv.getDiemTB());
            ps.setBoolean(4, sv.isGioiTinh());
            ps.executeUpdate();

            ps.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean update(String maSV, SinhVien sv) {

        try {
            conn = DBConnection.getConnection();
            String sql = "UPDATE SinhVien SET HoTen = ?, DiemTB = ?, GioiTinh = ? WHERE MaSV = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, sv.getHoTen());
            ps.setDouble(2, sv.getDiemTB());
            ps.setBoolean(3, sv.isGioiTinh());
            ps.setString(4, maSV);
            ps.executeUpdate();

            ps.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;

        }
        return true;
    }

    public boolean delete(String maSV) {

        try {
            conn = DBConnection.getConnection();
            String sql = "DELETE FROM SinhVien WHERE MaSV = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, maSV);
            ps.executeUpdate();

            ps.close();
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

}
