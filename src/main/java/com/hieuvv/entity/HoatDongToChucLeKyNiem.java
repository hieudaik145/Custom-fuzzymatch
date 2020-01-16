package com.hieuvv.entity;

import java.util.Date;

public class HoatDongToChucLeKyNiem {

	private String noiDungHoatDong ;
	private String quanHuyen;
	private String phuongXa;
	private String diaDiem;
	private Date hoatDongTuNgay;
	private Date hoatDongDenNgay;
	private String donViThucHien;
	
	public String getNoiDungHoatDong() {
		return noiDungHoatDong;
	}
	public void setNoiDungHoatDong(String noiDungHoatDong) {
		this.noiDungHoatDong = noiDungHoatDong;
	}
	public String getQuanHuyen() {
		return quanHuyen;
	}
	public void setQuanHuyen(String quanHuyen) {
		this.quanHuyen = quanHuyen;
	}
	public String getPhuongXa() {
		return phuongXa;
	}
	public void setPhuongXa(String phuongXa) {
		this.phuongXa = phuongXa;
	}
	public String getDiaDiem() {
		return diaDiem;
	}
	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}
	public Date getHoatDongTuNgay() {
		return hoatDongTuNgay;
	}
	public void setHoatDongTuNgay(Date hoatDongTuNgay) {
		this.hoatDongTuNgay = hoatDongTuNgay;
	}
	public Date getHoatDongDenNgay() {
		return hoatDongDenNgay;
	}
	public void setHoatDongDenNgay(Date hoatDongDenNgay) {
		this.hoatDongDenNgay = hoatDongDenNgay;
	}
	public String getDonViThucHien() {
		return donViThucHien;
	}
	public void setDonViThucHien(String donViThucHien) {
		this.donViThucHien = donViThucHien;
	}
	public HoatDongToChucLeKyNiem(String noiDungHoatDong, String quanHuyen, String phuongXa, String diaDiem,
			Date hoatDongTuNgay, Date hoatDongDenNgay, String donViThucHien) {
		super();
		this.noiDungHoatDong = noiDungHoatDong;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.diaDiem = diaDiem;
		this.hoatDongTuNgay = hoatDongTuNgay;
		this.hoatDongDenNgay = hoatDongDenNgay;
		this.donViThucHien = donViThucHien;
	}
	
}
