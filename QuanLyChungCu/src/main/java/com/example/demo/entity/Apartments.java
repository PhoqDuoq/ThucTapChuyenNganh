package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "apartments")
public class Apartments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ma_can_ho")
    private String maCanHo;

    @Column(name = "so_can")
    private String soCan;

    @Column(name = "dien_tich")
    private BigDecimal dienTich; // Có thể dùng Double nếu muốn đơn giản hơn

    @Column(name = "so_phong")
    private String soPhong;

    @Column(name = "chu_so_huu")
    private String chuSoHuu;

    @Column(name = "trang_thai")
    private String trangThai;



    public Apartments() {
        super();
    }

    public Apartments(String maCanHo, String soCan, BigDecimal dienTich, String soPhong, String chuSoHuu, String trangThai) {
        this.maCanHo = maCanHo;
        this.soCan = soCan;
        this.dienTich = dienTich;
        this.soPhong = soPhong;
        this.chuSoHuu = chuSoHuu;
        this.trangThai = trangThai;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaCanHo() {
        return maCanHo;
    }

    public void setMaCanHo(String maCanHo) {
        this.maCanHo = maCanHo;
    }

    public String getSoCan() {
        return soCan;
    }

    public void setSoCan(String soCan) {
        this.soCan = soCan;
    }

    public BigDecimal getDienTich() {
        return dienTich;
    }

    public void setDienTich(BigDecimal dienTich) {
        this.dienTich = dienTich;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}