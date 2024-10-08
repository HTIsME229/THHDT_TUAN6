import java.util.*;

public class Bai2 {

    public static class SinhVien {
        private String MSV;
        private String Ten;
        private String NgaySinh;
        private float DTB;
        Scanner sc = new Scanner(System.in);
        public String getMSV() {
            return MSV;
        }

        public void setMSV(String MSV) {
            this.MSV = MSV;
        }

        public float getDTB() {
            return DTB;
        }

        public void setDTB(float DTB) {
            this.DTB = DTB;
        }

        public String getNgaySinh() {
            return NgaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            NgaySinh = ngaySinh;
        }

        public String getTen() {
            return Ten;
        }

        public void setTen(String ten) {
            Ten = ten;
        }

        @Override
        public String toString() {
            return "SinhVien{" +
                    "MSV='" + MSV + '\'' +
                    ", Ten='" + Ten + '\'' +
                    ", NgaySinh=" + NgaySinh +
                    ", DTB=" + DTB +
                    '}';
        }

//        public void in() {
//            this.toString();
//        }

        public void nhap() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhap MSV: ");
            this.MSV = sc.nextLine();
            System.out.print("Nhap Ten: ");
            this.Ten = sc.nextLine();
            System.out.print("Nhap Ngay Sinh: ");
            this.NgaySinh = sc.nextLine();
            System.out.print("Nhap DTB: ");
            this.DTB = sc.nextFloat();
            sc.nextLine();


        }

    }
    private List<SinhVien> Ds = new ArrayList<>();
    public  void  sapXepTheoDiem(){
        Collections.sort(this.Ds,new  Comparator<SinhVien>() {
            public int compare(SinhVien sv1, SinhVien sv2) {
                return    sv1.getDTB() <sv2.getDTB() ? 1 :-1;
            }
        });

    }
public  void themSV(){
        int n ;
Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            this.Ds.add(sv);
        }
}
        public void  in(){
        for(SinhVien sv : this.Ds){
          System.out.println(sv);
        }
            }


}
