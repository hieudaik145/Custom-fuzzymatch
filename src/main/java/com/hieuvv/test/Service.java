package com.hieuvv.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.hieuvv.composite.Document;
import com.hieuvv.composite.Element;
import com.hieuvv.composite.ElementType;
import com.hieuvv.entity.HoatDongCuaTrungTamVanHoa;
import com.hieuvv.entity.HoatDongTuyenTruyenLuuDong;

public class Service {

	private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

	public static List<HoatDongCuaTrungTamVanHoa> createListHoatDongCuaTrungTamVanHoa() throws ParseException {

		return Arrays.asList(new HoatDongCuaTrungTamVanHoa(1, "hoat dong dip tet", formatter.parse("12-12-2020"), formatter.parse("20-12-2020"), 250, 9000000, "quan Hai Chau", "Hai Chau 1", "Trung Tam Van Hoa Quan Hai Chau", "hoat dong truc quan"),
				new HoatDongCuaTrungTamVanHoa(15, "hoat dong dip tet", formatter.parse("12-12-2020"), formatter.parse("20-12-2020"), 250, 9000000, "quan Hai Chau", "Hai Chau 1", "Trung Tam Van Hoa Quan Hai Chau", "hoat dong truc quan"),
				new HoatDongCuaTrungTamVanHoa(2, "hoat dong 2", formatter.parse("12-12-2020"), formatter.parse("32-12-2020"), 250, 9000000, "quan Hai Chau", "Hai Chau 1", "Trung Tam Van Hoa QuanSFS Hai Chau", "hoat dong trSFuc quan"),
				new HoatDongCuaTrungTamVanHoa(3, "hoat dong 3", formatter.parse("12-12-2020"), formatter.parse("22-01-2020"), 250, 9000000, "quan Hai Chau", "Hai Chau 1", "Trung Tam Van Hoa Quan Hai Chau", "hoat dong SDFtruc quan"),
				new HoatDongCuaTrungTamVanHoa(4, "hoat dong 4", formatter.parse("12-12-2020"), formatter.parse("20-10-2020"), 250, 9000000, "quan HaDi Chau", "Hai Chau 1", "Trung Tam Van Hoa Quan Hai Chau", "hoat dong truc quanSFS"),
				new HoatDongCuaTrungTamVanHoa(5, "hoat dong 5", formatter.parse("12-12-2020"), formatter.parse("20-08-2020"), 250, 9000000, "quan Hai CAhau", "Hai Chau 1", "Trung Tam Van Hoa Quan Hai Chau", "hoat dong truc quFSFan"),
				new HoatDongCuaTrungTamVanHoa(6, "hoat dong 6", formatter.parse("12-12-2020"), formatter.parse("20-05-2020"), 250, 9000000, "quan Hai Chau", "Hai Chau 1", "Trung Tam Van Hoa Quan Hai Chau", "hoat dong truc quFSan"));

	}
	
	public static List<HoatDongTuyenTruyenLuuDong> createListHoatDongTuyenTruyenLuuDong() throws ParseException {
		
		return Arrays.asList(
				new HoatDongTuyenTruyenLuuDong("tuyen truyen phong chong ma tuy", "cong tac ", "quan hai chau", "hai chau 1", "21 nguyen van linh", formatter.parse("12-12-2020"), formatter.parse("12-12-2020"), "trung tam van hoa quan hai chau", 250, 30000, 7000, "mo ta chi tiet"),
				new HoatDongTuyenTruyenLuuDong("tuyen truyen phong chong ma tuy cap d  cao", "cong tac ", "quan hai chau", "hai chau 1", "21 nguyen van linh", formatter.parse("13-12-2020"), formatter.parse("12-12-2020"), "trung tam van hoa quan hai chau", 250, 30000, 7000, "mo ta chi tiet"));
	}

	/**
	 * create document match cho hoat dong cua trung tam van hoa
	 * @param input
	 * @return
	 * @throws ParseException 
	 */
	public static List<Document> createDocumentForHoatDongTrungTamVanHoa(List<HoatDongCuaTrungTamVanHoa> input) throws ParseException {
		
		return input.parallelStream().map(x -> {
			return new Document.Builder(x)
					.addElement(new Element.Builder().setType(ElementType.NOIDUNGHOATDONG).setValue(x.getNoiDungHoatDong()).createElement())
					.addElement(new Element.Builder().setType(ElementType.HOATDONGTUNGAY).setValue(x.getHoatDongTuNgay()).createElement())
					.addElement(new Element.Builder().setType(ElementType.HOATDONGDENNGAY).setValue(x.getHoatDongDenNgay()).createElement())
					.addElement(new Element.Builder().setType(ElementType.QUANHUYEN).setValue(x.getQuanHuyen()).createElement())
					.addElement(new Element.Builder().setType(ElementType.XAPHUONG).setValue(x.getPhuongXa()).createElement())
					.createDocument();
		}).collect(Collectors.toList());
	}
	
	public static List<Document> createDocumentForHoatDongTuyenTruyenLuuDong(List<HoatDongTuyenTruyenLuuDong> input) {
		
		return input.parallelStream().map(x -> {
			return new Document.Builder(x)
					.addElement(new Element.Builder().setType(ElementType.NOIDUNGHOATDONG).setValue(x.getNoiDungHoatDong()).createElement())
					.addElement(new Element.Builder().setType(ElementType.HOATDONGTUNGAY).setValue(x.getHoatDongTuNgay()).createElement())
					.addElement(new Element.Builder().setType(ElementType.HOATDONGDENNGAY).setValue(x.getHoatDongDenNgay()).createElement())
					.addElement(new Element.Builder().setType(ElementType.QUANHUYEN).setValue(x.getQuanHuyen()).createElement())
					.addElement(new Element.Builder().setType(ElementType.XAPHUONG).setValue(x.getPhuongXa()).createElement())
					.createDocument();
		}).collect(Collectors.toList());
	}

}
