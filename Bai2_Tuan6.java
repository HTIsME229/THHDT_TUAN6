import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bai2_Tuan6 {
	public static class sinhVien {
		private String maSinhVien;
		private String ten;
		private String ngaySinh;
		private double diemTrungBinh;
		
	public sinhVien(String maSinhVien,String ten,String ngaySinh,double diemTrungBinh) {
		this.maSinhVien= maSinhVien;
		this.ten=ten;
		this.ngaySinh=ngaySinh;
		this.diemTrungBinh=diemTrungBinh;
	}
	
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}
	
	public void nhapThongTin() {
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap ma sinh vien ");
		String maSinhVien = sc.nextLine();
		System.out.println("nhap ten sinh vien ");
		String ten = sc.nextLine();
		System.out.println("nhap ngay sinh sinh vien ");
		String ngaySinh = sc.nextLine();
		System.out.println("nhap diem trung binh sinh vien ");
		double diemTrungBinh = sc.nextDouble();
	}
	public void inThongTin() {
		System.out.println("Ma sinh vien :" + maSinhVien);
		System.out.println("Ma sinh vien :" + ten);
		System.out.println("Ma sinh vien :" + ngaySinh);
		System.out.println("Ma sinh vien :" + diemTrungBinh);
	}
	public static void sapXep(ArrayList<sinhVien> danhSachSV) {
        Collections.sort(danhSachSV, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien sv1, sinhVien sv2) {
                return Double.compare(sv2.getDiemTrungBinh(), sv1.getDiemTrungBinh());
			}
		});
	}
	}		
}

