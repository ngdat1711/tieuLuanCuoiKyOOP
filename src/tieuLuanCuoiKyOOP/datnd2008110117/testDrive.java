package tieuLuanCuoiKyOOP.datnd2008110117;

import java.util.Date;

public class testDrive {
    public static void main(String[] args) {
        hangHoa hangHoa = new hangThucPham (int maHang; String tenHang; double soLuongTonKho; double donGia; String nhaSanXuat; Date ngayNhapKho);
        danhSachHangHoa danhSachHangHoa = new danhSachHangHoa();
        danhSachHangHoa.themhangHoa(hangHoa);
        danhSachHangHoa.inThongTin();
        
        danhSachHangHoa DanhSachHangHoa = new danhSachHangHoa();
        danhSachHangHoa.nhapDuLieu();
        danhSachHangHoa.kiemTraHSD();
        danhSachHangHoa.inThongTin();
        
        String LC = null;
        do {
             hangHoa HangHoa = danhSachHangHoa.nhapHangHoa();
             danhSachHangHoa.themHangHoa(hangHoa);
             System.out.println("Bạn Có Muốn Tiếp Tục Không [Yes], [No]");
             LC = danhSachHangHoa.sc.nextLine();
         } while (LC.equals ("Y"));

        danhSachHangHoa.inThongTin();
        
    }
    
}
