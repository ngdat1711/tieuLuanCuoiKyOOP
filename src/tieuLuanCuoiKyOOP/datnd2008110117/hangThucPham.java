package tieuLuanCuoiKyOOP.datnd2008110117;

import java.text.SimpleDateFormat;
import java.util.Date;

public class hangThucPham extends hangHoa{
    
    private Date ngaySanXuat, ngayHetHan;
    private String nhaCungCap;

    public hangThucPham(){

    }

    public hangThucPham(Date ngaySanXuat, Date ngayHetHan, String nhaCungCap) {
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public hangThucPham(int maHang, String tenHang, double soLuongTonKho, double donGia, Date ngaySanXuat, Date ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan){
        if(ngayHetHan != null){
            if(ngayHetHan.after(this.ngaySanXuat)){
            this.ngayHetHan = ngayHetHan;
        }else{
            System.out.println(" Ngày Hết Hạn Phải Hợp Lý ");
            this.ngayHetHan = new Date();
        }
        } else{
        
            System.out.println(" Ngày Hết Hạn Không Để Trống ");
        
            this.ngayHetHan = new Date();
        }
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public String toString() {
        SimpleDateFormat sf = new SimpleDateFormat("DD/MM/YYYY");
        String str1 = sf.format(ngayHetHan);
        String str2 = sf.format(ngaySanXuat);
        return "HangThucPham [Ngay Het Han=" + str1 + ", \nNgay San Xuat=" + str2 + ", \nNha Cung Cap=" + nhaCungCap
                + "]" + super.toString();
    }
}
