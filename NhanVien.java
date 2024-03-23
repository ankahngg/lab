public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX = 15000000;

    public double getHeSoLuong() {
        return heSoLuong;
    }
    public double getLuongCoBan() {
        return luongCoBan;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public NhanVien(String ten, double luong, double heso) {
        this.heSoLuong = heso;
        this.luongCoBan = luong;
        this.tenNhanVien = ten;
    }
    public NhanVien() {
        this.heSoLuong = 0;
        this.luongCoBan = 0;
        this.tenNhanVien = "noname";
    }

    public void inTTin() {
        System.out.println("Ten: "+this.tenNhanVien);
        System.out.println("Luong co ban: "+this.luongCoBan);
        System.out.println("He so luong: "+this.heSoLuong);
    }

    public Boolean tangLuong(double x) {
        double tmp = x + this.heSoLuong;
        if(tmp*luongCoBan <= LUONG_MAX) {
            tmp += x;
            System.out.println("Duoc tang luong");
            return true;
        }
        else {
            System.out.println("Khong duoc tang luong");
            return false;
        }
    } 

    public double tinhLuong() {
        return luongCoBan*heSoLuong;
    }

}
