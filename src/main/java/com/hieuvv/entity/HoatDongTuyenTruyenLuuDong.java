package com.hieuvv.entity;

import java.util.Date;

public class HoatDongTuyenTruyenLuuDong {

	private String tenHoatDong;
	private String noiDungHoatDong;
	private String quanHuyen;
	private String phuongXa;
	private String diaDiem;
	private Date hoatDongTuNgay;
	private Date hoatDongDenNgay;
	private String donViThucHien;
	private long soDoi;
	private long soLuotNguoiXem;
	private long soBuoiHoatDong;
	private String moTaChiTiet;
	
	public HoatDongTuyenTruyenLuuDong(String tenHoatDong, String noiDungHoatDong, String quanHuyen, String phuongXa,
			String diaDiem, Date hoatDongTuNgay, Date hoatDongDenNgay, String donViThucHien, long soDoi,
			long soLuotNguoiXem, long soBuoiHoatDong, String moTaChiTiet) {
		super();
		this.tenHoatDong = tenHoatDong;
		this.noiDungHoatDong = noiDungHoatDong;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.diaDiem = diaDiem;
		this.hoatDongTuNgay = hoatDongTuNgay;
		this.hoatDongDenNgay = hoatDongDenNgay;
		this.donViThucHien = donViThucHien;
		this.soDoi = soDoi;
		this.soLuotNguoiXem = soLuotNguoiXem;
		this.soBuoiHoatDong = soBuoiHoatDong;
		this.moTaChiTiet = moTaChiTiet;
	}
	
	public String getTenHoatDong() {
		return tenHoatDong;
	}
	public void setTenHoatDong(String tenHoatDong) {
		this.tenHoatDong = tenHoatDong;
	}
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
	public long getSoDoi() {
		return soDoi;
	}
	public void setSoDoi(long soDoi) {
		this.soDoi = soDoi;
	}
	public long getSoLuotNguoiXem() {
		return soLuotNguoiXem;
	}
	public void setSoLuotNguoiXem(long soLuotNguoiXem) {
		this.soLuotNguoiXem = soLuotNguoiXem;
	}
	public long getSoBuoiHoatDong() {
		return soBuoiHoatDong;
	}
	public void setSoBuoiHoatDong(long soBuoiHoatDong) {
		this.soBuoiHoatDong = soBuoiHoatDong;
	}
	public String getMoTaChiTiet() {
		return moTaChiTiet;
	}
	public void setMoTaChiTiet(String moTaChiTiet) {
		this.moTaChiTiet = moTaChiTiet;
	}

	@Override
	public String toString() {
		return "HoatDongTuyenTruyenLuuDong [tenHoatDong=" + tenHoatDong + ", noiDungHoatDong=" + noiDungHoatDong
				+ ", quanHuyen=" + quanHuyen + ", phuongXa=" + phuongXa + ", diaDiem=" + diaDiem + ", hoatDongTuNgay="
				+ hoatDongTuNgay + ", hoatDongDenNgay=" + hoatDongDenNgay + ", donViThucHien=" + donViThucHien
				+ ", soDoi=" + soDoi + ", soLuotNguoiXem=" + soLuotNguoiXem + ", soBuoiHoatDong=" + soBuoiHoatDong
				+ ", moTaChiTiet=" + moTaChiTiet + "]";
	}
	
	
}
