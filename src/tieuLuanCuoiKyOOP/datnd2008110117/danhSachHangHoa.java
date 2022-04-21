package tieuLuanCuoiKyOOP.datnd2008110117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class danhSachHangHoa {
    

    private List <hangHoa> DSHH = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sf = new SimpleDateFormat("DD/MM/YYYY");
    private Date ngaySanXuat;
    private Date ngayHetHan;
    private Date ngayNhapKho; 
    private Date hanSuDung;
    private String nhaCungCap;
    private String nhaSanXuat;
    private int TGBH;
    private double congSuat;


    public Date gethSD() {
        return hanSuDung;
    }

    public void sethSD(Date hSD) {
        this.hanSuDung = hSD;
    }

    public void suaHangHoa() {

    }

    public void xoaHangHoa(){
        
    }

    public void inThongTin() {
        for (hangHoa hangHoa : DSHH) {

            System.out.println( hangHoa );
        
        }
    }

    public hangHoa nhapDuLieu() {
      
        hangHoa hangHoa = null;
        
        try{

        System.out.println(" Nhập Mã Hàng: ");
        int maHang = sc.nextInt();
        sc.nextLine();

        System.out.println(" Nhập Tên Hàng: ");
        String tenHang = sc.nextLine();

        System.out.println(" Nhập Số Lượng Tồn Kho: ");
        double soLuongTonKho = sc.nextDouble();

        System.out.println("Đơn Giá: ");
        double donGia = sc.nextDouble();

        System.out.println("Lựa Chọn Của Bạn : [1: Hàng Thực Phẩm] [2: Hàng Điện Máy] [3: Hàng Sứ]");
        int lc = sc.nextInt();
        switch (lc) {
            case 1:
                System.out.println("=====HÀNG THỰC PHẨM=====");
                try {
                    sc.nextLine();
                    System.out.println("Nhập Ngày Sản Xuất: [DD/MM/YYYY]");
                    ngaySanXuat = sf.parse(sc.nextLine());
                    System.out.println("Nhập Ngày Hết Hạn: [DD/MM/YYYY]");
                    ngayHetHan = sf.parse(sc.nextLine());
                    System.out.println("Nhập Nhà Cung Cấp: ");
                    nhaCungCap = sc.nextLine();

                }

                catch (Exception e) {
                }

                hangHoa = new hangThucPham(maHang, tenHang, soLuongTonKho, donGia, ngaySanXuat, ngayHetHan, nhaCungCap); break;
            
            case 2:
                System.out.println("=====Hàng Điện Máy=====");
                System.out.println("Nhập Thời Gian Bảo Hàng: ");
                TGBH = sc.nextInt();
                System.out.println("Nhập Công Suất: ");
                congSuat = sc.nextDouble();
                hangHoa = new dienMay(maHang, tenHang, soLuongTonKho, donGia, TGBH, congSuat); break;

            case 3:
                System.out.println("=====Hàng Sứ=====");
                System.out.println("Nhập Nhà Sản Suất: ");
                nhaSanXuat = sc.nextLine();
                try {
                    System.out.println("Nhập Ngày Nhập Kho: ");
                    ngayNhapKho = sf.parse(sc.nextLine());
                } catch (Exception e) {

                } break;

            default:
                System.out.println(" XXX "); break;
        }
        return hangHoa;
    }catch(Exception e ){
        System.out.println("    ||| Vui Lòng Nhập Lại |||  ");
    }
        return hangHoa;

    }

    public void menu(){
        do{
            System.out.println(">>>>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<<<<");
            System.out.println("    1==================== Thêm Hàng Hóa =======================1");
            System.out.println("    2===================== Xóa Hàng Hóa =======================2");
            System.out.println("    3===================== Sửa Hàng Hóa =======================3");
            System.out.println("    4================== In Hàng Hóa Đã Bán ====================4");
            System.out.println("    5================== In Hàng Hóa Đã Bán ===================5");
            System.out.println("    6================ In Hàng Hóa Sắp Hết Hạn =================6");
            System.out.println("    7======================= Tìm Kiếm =========================7");
            System.out.println("    8======================= Thoát =========================8");
            System.out.println(" Nhập Số Bạn Muốn Chọn: ");
            int lc = sc.nextInt();
            
            switch(lc){
                case 0: break;
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: kiemTraHSD(); break;
                case 5: TimKiem(); break;
                default: System.out.println(" Vui Lòng Nhập Lại"); break;
            }            
        }while(true);
    }

    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");
        String st = simpleDateFormat.format(today);
        if (this.gethSD().compareTo(today) < 0) {
            System.out.println("Hôm Nay Là Ngày " + st + ", Hàng Hóa Đã Hết Hạn ");
        } else {
            System.out.println("Hôm Nay Là Ngày " + st + ", Hàng Hóa Vẫn Còn Hạn ");
        }
    }
    
}
