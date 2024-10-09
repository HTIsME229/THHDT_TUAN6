
public class Bai3_Tuan6 {
	public static class taiKhoang{
		private String soTaiKhoang;
		private String chuTaiKhoang;
		private double soDu;
		
		public taiKhoang(String soTaiKhoang,String chuTaiKhoang,double soDu) {
			this.soTaiKhoang= soTaiKhoang;
			this.chuTaiKhoang= chuTaiKhoang;
			this.soDu=soDu;
		}
		
		public void guiTien(double tien) {
			if(tien>0) {
				soDu=soDu +tien;
				System.out.println("gui tien thanh cong,so du hien tai :"+soDu);
			}
			else
			    System.out.println("so tien khong hop le");
		}
		public void rutTien(double tien) {
			if(tien>0&&tien<=soDu) {
				soDu=soDu-tien;
				System.out.println("rut tien thanh cong,so du hien tai :"+soDu);
			}
			else
				System.out.println("so tien rut vuot qua so du ");
		}
		public double kiemTraSoDu() {
			return soDu;
		}
	}
}
