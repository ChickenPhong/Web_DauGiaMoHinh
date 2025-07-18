/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgmh.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Tran Quoc Phong
 */
@Embeddable
public class TheoDoiSanPhamId implements Serializable{
    @Column(name = "nguoiDung_id")
    private Integer nguoiDungId;

    @Column(name = "sanPham_id")
    private Integer sanPhamId;
    
    public Integer getNguoiDungId() {
        return nguoiDungId;
    }

    public void setNguoiDungId(Integer nguoiDungId) {
        this.nguoiDungId = nguoiDungId;
    }

    public Integer getSanPhamId() {
        return sanPhamId;
    }

    public void setSanPhamId(Integer sanPhamId) {
        this.sanPhamId = sanPhamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TheoDoiSanPhamId)) return false;
        TheoDoiSanPhamId that = (TheoDoiSanPhamId) o;
        return Objects.equals(nguoiDungId, that.nguoiDungId) &&
               Objects.equals(sanPhamId, that.sanPhamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nguoiDungId, sanPhamId);
    }
}
