import java.util.Scanner;

public class Hinh{
    protected Scanner sc;
    public   String tenHinh;

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public Hinh(String tenHinh) {
        sc = new Scanner(System.in);
        this.tenHinh = tenHinh;
    }
    public Hinh(){
        sc = new Scanner(System.in);
    }
    public  void  Nhap(){
        System.out.println("Nhap Hinh");
        this.tenHinh = sc.nextLine();
    }
public  void Xuat(){
        System.out.println("Hinh" + this.tenHinh);
}

}
