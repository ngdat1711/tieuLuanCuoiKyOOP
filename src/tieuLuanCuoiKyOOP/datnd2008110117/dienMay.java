package tieuLuanCuoiKyOOP.datnd2008110117;

public class dienMay extends HangHoa {
    int TGBH;
    double congSuat;

    public dienMay(int TGBH, double congSuat) {
        this.TGBH = TGBH;
        this.congSuat = congSuat;
    }

    public dienMay(int maHang, String tenHang, double soLuongTonKho, double donGia, int TGBH, double congSuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.TGBH = TGBH;
        this.congSuat = congSuat;
    }

    public int gettGBH() {
        return TGBH;
    }

    public void settGBH(int tGBH) {
        this.TGBH = TGBH;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString () {

        return "Điện Máy [ congSuat= " + congSuat + ", TGBH =" + TGBH + "]";
    }
    
}
