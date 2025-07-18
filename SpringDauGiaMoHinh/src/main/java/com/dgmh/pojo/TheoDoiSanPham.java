/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgmh.pojo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Tran Quoc Phong
 */
@Entity
@Table(name = "theodoisanpham")
public class TheoDoiSanPham implements Serializable{
    @EmbeddedId
    private TheoDoiSanPhamId id;

    @ManyToOne
    @MapsId("nguoiDungId")
    @JoinColumn(name = "nguoiDung_id")
    private NguoiDung nguoiDung;

    @ManyToOne
    @MapsId("sanPhamId")
    @JoinColumn(name = "sanPham_id")
    private SanPham sanPham;
    
    public TheoDoiSanPhamId getId() {
        return id;
    }

    public void setId(TheoDoiSanPhamId id) {
        this.id = id;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

}
