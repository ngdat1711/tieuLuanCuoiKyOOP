package tieuLuanCuoiKyOOP.datnd2008110117;
import java.text.NumberFormat;
import java.util.Locale;

public  abstract class hangHoa {
    private int maHang;
    private String tenHang;
    private double soLuongTonKho;
    private double donGia;

    public hangHoa(){}

    public hangHoa(int maHang, String tenHang, double soLuongTonKho, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        if(maHang > 0){
            this.maHang = maHang;
        }else{
            System.out.println("Mã Hàng Không Có Trong Đây @@@ ");
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        if(tenHang != null){
            this.tenHang = tenHang;
        }else{
            System.out.println(" Không Được Để Rỗng ");
        }
    }

    public double getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(double soLuongTonKho) {
        if(soLuongTonKho >= 0){
            this.soLuongTonKho = soLuongTonKho;
        }else{
            System.out.println("Số Lượng Phải Lớn Hơn Hoặc Bằng 0");
        }
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        }else{
            System.out.println("Đơn Giá Phải Lớn Hơn 0 ");
        }
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienViet = NumberFormat.getCurrencyInstance(localeVN);
        String str = tienViet.format(donGia);
        return "HangHoa [donGia=" + donGia + ", maHang=" + maHang + ", soLuongTonKho=" + soLuongTonKho + ", tenHang="
                + tenHang + "]";
    }
    
}
