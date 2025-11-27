package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "services")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ten_dich_vu")
    private String tenDichVu; // VD: Phí quản lý, Bãi xe ô tô

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "gia_tien")
    private BigDecimal giaTien; // Dùng BigDecimal cho tiền tệ

    @Column(name = "don_vi_tinh")
    private String donViTinh; // VD: m2, tháng, căn

    @Column(name = "trang_thai")
    private String trangThai; // VD: Hoạt động


    public Services() {
    }

    public Services(String tenDichVu, String moTa, BigDecimal giaTien, String donViTinh, String trangThai) {
        this.tenDichVu = tenDichVu;
        this.moTa = moTa;
        this.giaTien = giaTien;
        this.donViTinh = donViTinh;
        this.trangThai = trangThai;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public BigDecimal getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(BigDecimal giaTien) {
        this.giaTien = giaTien;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}