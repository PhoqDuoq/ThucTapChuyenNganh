package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "residents")
public class Residents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ma_cu_dan")
    private String maCuDan; // VD: CD001

    @Column(name = "ho_ten")
    private String hoTen;

    // --- Khóa ngoại trỏ về căn hộ ---
    @Column(name = "id_can_ho")
    private Integer idCanHo; // Dùng Integer (Object) thay vì int để cho phép null nếu cư dân chưa vào ở

    @Column(name = "so_dien_thoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;


    public Residents() {
        super();
    }

    public Residents(String maCuDan, String hoTen, Integer idCanHo, String soDienThoai, String email) {
        this.maCuDan = maCuDan;
        this.hoTen = hoTen;
        this.idCanHo = idCanHo;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaCuDan() {
        return maCuDan;
    }

    public void setMaCuDan(String maCuDan) {
        this.maCuDan = maCuDan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getIdCanHo() {
        return idCanHo;
    }

    public void setIdCanHo(Integer idCanHo) {
        this.idCanHo = idCanHo;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}