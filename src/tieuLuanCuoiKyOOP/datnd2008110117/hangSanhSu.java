package tieuLuanCuoiKyOOP.datnd2008110117;

import java.util.Date;

public class hangSanhSu extends hangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;
    
    public hangSanhSu(){ 
    }

    public hangSanhSu(String nhaSanXuat, Date ngayNhapKho) {
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public hangSanhSu(int maHang, String tenHang, double soLuongTonKho, double donGia, String nhaSanXuat, Date ngayNhapKho){
        
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String toString() {
        return "HangSanhSu [ngayNhapKho=" + ngayNhapKho + ", nhaSanXuat=" + nhaSanXuat + "]";
    }
    

}
