package com.hieuvv.entity;

import java.util.Date;

public class HoatDongCuaTrungTamVanHoa {

	private int id;
	private String noiDungHoatDong;
	private Date hoatDongTuNgay;
	private Date hoatDongDenNgay;
	private int soLuongNguoiThamGia;
	private float kinhPhiHoatDong;
	private String quanHuyen;
	private String phuongXa;
	private String trungTamVanHoaThucHien;
	private String hinhThucHoatDongTrungTamVanHoa;

	public String getNoiDungHoatDong() {
		return noiDungHoatDong;
	}

	public void setNoiDungHoatDong(String noiDungHoatDong) {
		this.noiDungHoatDong = noiDungHoatDong;
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

	public int getSoLuongNguoiThamGia() {
		return soLuongNguoiThamGia;
	}

	public void setSoLuongNguoiThamGia(int soLuongNguoiThamGia) {
		this.soLuongNguoiThamGia = soLuongNguoiThamGia;
	}

	public float getKinhPhiHoatDong() {
		return kinhPhiHoatDong;
	}

	public void setKinhPhiHoatDong(float kinhPhiHoatDong) {
		this.kinhPhiHoatDong = kinhPhiHoatDong;
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

	public String getTrungTamVanHoaThucHien() {
		return trungTamVanHoaThucHien;
	}

	public void setTrungTamVanHoaThucHien(String trungTamVanHoaThucHien) {
		this.trungTamVanHoaThucHien = trungTamVanHoaThucHien;
	}

	public String getHinhThucHoatDongTrungTamVanHoa() {
		return hinhThucHoatDongTrungTamVanHoa;
	}

	public void setHinhThucHoatDongTrungTamVanHoa(String hinhThucHoatDongTrungTamVanHoa) {
		this.hinhThucHoatDongTrungTamVanHoa = hinhThucHoatDongTrungTamVanHoa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HoatDongCuaTrungTamVanHoa(int id, String noiDungHoatDong, Date hoatDongTuNgay, Date hoatDongDenNgay,
			int soLuongNguoiThamGia, float kinhPhiHoatDong, String quanHuyen, String phuongXa,
			String trungTamVanHoaThucHien, String hinhThucHoatDongTrungTamVanHoa) {
		super();
		this.id = id;
		this.noiDungHoatDong = noiDungHoatDong;
		this.hoatDongTuNgay = hoatDongTuNgay;
		this.hoatDongDenNgay = hoatDongDenNgay;
		this.soLuongNguoiThamGia = soLuongNguoiThamGia;
		this.kinhPhiHoatDong = kinhPhiHoatDong;
		this.quanHuyen = quanHuyen;
		this.phuongXa = phuongXa;
		this.trungTamVanHoaThucHien = trungTamVanHoaThucHien;
		this.hinhThucHoatDongTrungTamVanHoa = hinhThucHoatDongTrungTamVanHoa;
	}

	public HoatDongCuaTrungTamVanHoa() {
		super();
	}

	@Override
	public String toString() {
		return "HoatDongCuaTrungTamVanHoa [id=" + id + ", noiDungHoatDong=" + noiDungHoatDong + ", hoatDongTuNgay="
				+ hoatDongTuNgay + ", hoatDongDenNgay=" + hoatDongDenNgay + ", soLuongNguoiThamGia="
				+ soLuongNguoiThamGia + ", kinhPhiHoatDong=" + kinhPhiHoatDong + ", quanHuyen=" + quanHuyen
				+ ", phuongXa=" + phuongXa + ", trungTamVanHoaThucHien=" + trungTamVanHoaThucHien
				+ ", hinhThucHoatDongTrungTamVanHoa=" + hinhThucHoatDongTrungTamVanHoa + "]";
	}

}
