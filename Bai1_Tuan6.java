public class Bai1_Tuan6 {

    public static class HinhChuNhat {
        private double ChieuDai;
        private double ChieuRong;

        public HinhChuNhat(double ChieuDai, double ChieuRong) {
            this.ChieuDai = ChieuDai;
            this.ChieuRong = ChieuRong;
        }

        public double TinhDienTich() {
            return ChieuDai * ChieuRong;
        }

        public double TinhChuVi() {
            return (ChieuDai + ChieuRong) * 2;
        }
    }


}
