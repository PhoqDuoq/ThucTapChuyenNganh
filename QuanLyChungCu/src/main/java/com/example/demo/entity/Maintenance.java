package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "maintenance")
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ma_yeu_cau")
    private String maYeuCau; // VD: YC001

    // --- Khóa ngoại trỏ về căn hộ ---
    @Column(name = "id_can_ho")
    private int idCanHo;

    @Column(name = "noi_dung")
    private String noiDung; // VD: Sửa hệ thống điện

    @Column(name = "ngay_yeu_cau")
    private LocalDate ngayYeuCau;

    @Column(name = "muc_do_uu_tien")
    private String mucDoUuTien; // VD: Thấp, Trung bình, Cao

    @Column(name = "trang_thai")
    private String trangThai; // VD: Chờ xử lý, Hoàn thành



    public Maintenance() {
        super();
    }

    public Maintenance(String maYeuCau, int idCanHo, String noiDung, LocalDate ngayYeuCau, String mucDoUuTien, String trangThai) {
        this.maYeuCau = maYeuCau;
        this.idCanHo = idCanHo;
        this.noiDung = noiDung;
        this.ngayYeuCau = ngayYeuCau;
        this.mucDoUuTien = mucDoUuTien;
        this.trangThai = trangThai;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaYeuCau() {
        return maYeuCau;
    }

    public void setMaYeuCau(String maYeuCau) {
        this.maYeuCau = maYeuCau;
    }

    public int getIdCanHo() {
        return idCanHo;
    }

    public void setIdCanHo(int idCanHo) {
        this.idCanHo = idCanHo;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public LocalDate getNgayYeuCau() {
        return ngayYeuCau;
    }

    public void setNgayYeuCau(LocalDate ngayYeuCau) {
        this.ngayYeuCau = ngayYeuCau;
    }

    public String getMucDoUuTien() {
        return mucDoUuTien;
    }

    public void setMucDoUuTien(String mucDoUuTien) {
        this.mucDoUuTien = mucDoUuTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}