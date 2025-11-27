package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "fees")
public class Fees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    // CÁCH 1: Ánh xạ dạng ID đơn giản (Dễ dùng khi Insert dữ liệu)
    @Column(name = "id_can_ho")
    private int idCanHo;

    /* CÁCH 2: Ánh xạ quan hệ JPA (Dùng để lấy thông tin căn hộ chi tiết)
       Nếu dùng cách này, bạn cần xóa dòng 'private int idCanHo' ở trên đi.
    @ManyToOne
    @JoinColumn(name = "id_can_ho", nullable = false)
    private ApartmentsDAO apartments;
    */

    @Column(name = "ky_thanh_toan")
    private String kyThanhToan; // VD: 11/2025

    @Column(name = "tong_phi")
    private BigDecimal tongPhi; // Dùng BigDecimal cho tiền tệ để tránh sai số

    @Column(name = "trang_thai")
    private String trangThai; // VD: Chưa thanh toán, Đã thanh toán


    public Fees() {
    }

    public Fees(int idCanHo, String kyThanhToan, BigDecimal tongPhi, String trangThai) {
        this.idCanHo = idCanHo;
        this.kyThanhToan = kyThanhToan;
        this.tongPhi = tongPhi;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCanHo() {
        return idCanHo;
    }

    public void setIdCanHo(int idCanHo) {
        this.idCanHo = idCanHo;
    }

    public String getKyThanhToan() {
        return kyThanhToan;
    }

    public void setKyThanhToan(String kyThanhToan) {
        this.kyThanhToan = kyThanhToan;
    }

    public BigDecimal getTongPhi() {
        return tongPhi;
    }

    public void setTongPhi(BigDecimal tongPhi) {
        this.tongPhi = tongPhi;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}