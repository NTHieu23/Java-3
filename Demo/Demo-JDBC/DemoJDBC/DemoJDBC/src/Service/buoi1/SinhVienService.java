/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.buoi1;

import Model.buoi1.SinhVien;
import Repository.buoi1.SinhVienRepository;
import java.util.ArrayList;

/**
 *
 * @author tdahi
 */
public class SinhVienService {

    private SinhVienRepository sinhVienRepository = new SinhVienRepository();
    
    public ArrayList<SinhVien> getAll() {
        return sinhVienRepository.getAll();
    }
    
    public boolean add(SinhVien sv) {
        return sinhVienRepository.add(sv);
    }
    
    public boolean update(String maSV, SinhVien sv) {
        return sinhVienRepository.update(maSV, sv);
    }
    
    public boolean delete(String maSV) {
        return sinhVienRepository.delete(maSV);
    }
    
}
