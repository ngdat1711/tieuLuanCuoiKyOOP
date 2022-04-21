package tieuLuanCuoiKyOOP.datnd2008110117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class danhSachHangHoa {
    

    private List <HangHoa> DSHH = new ArrayList<>();
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
        for (HangHoa hangHoa : DSHH) {

            System.out.println( hangHoa );
        
        }
    }

    public HangHoa nhapDuLieu() {
      
        HangHoa hangHoa = null;
        
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

        System.out.println("Lựa Chọn Của Bạn : [1: Hàng Thực Phẩm] [2: Hàng Điện Máy] [3: Hàng Sanh Su]");
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

                } catch (Exception e) {

                }
                hangHoa = new HangThucPham(maHang, tenHang, soLuongTonKho, donGia, ngaySanXuat, ngayHetHan, nhaCungCap); break;
            case 2:
                System.out.println("===HANG DIEN MAY===");
                System.out.println("Nhap thoi gian bao hanh: ");
                tGBH = sc.nextInt();
                System.out.println("Nhap cong suat: ");
                congSuat = sc.nextDouble();
                hangHoa = new HangDienMay(maHang, tenHang, soLuongTonKho, donGia, tGBH, congSuat);

                break;
            case 3:
                System.out.println("===HANG SANH SU===");
                System.out.println("Nhap nha san xuat: ");
                nhaSanXuat = sc.nextLine();
                try {
                    System.out.println("Nhap ngay nhap kho: ");
                    ngayNhapKho = sf.parse(sc.nextLine());
                } catch (Exception e) {

                }
                break;
            default:
                System.out.println("xxx");
                break;
        }
        return hangHoa;
    }catch(Exception e ){
        System.out.println("Nhap sai roi! Nhap lai di!!!");
    }
        return hangHoa;

    }

    // public void nhapHangHoa(){
    //     System.out.println("Nhap so luong hang hoa muon them: ");
    //     int n = sc.nextInt();
    //     for (int i = 0; i < n; i++) {
    //         System.out.printf("Nhap hang hoa thu: ", i +1);
    //         HangHoa hangHoa = new HangHoa();
    //         hangHoa.nhapDuLieu();

    //     }
    // }

    public void menu(){
        do{
            System.out.println("===========================MENU===========================");
            System.out.println("=1====================Them Hang Hoa=======================");
            System.out.println("=2=====================Xoa Hang Hoa=======================");
            System.out.println("=3=====================Sua Hang Hoa=======================");
            System.out.println("=4==================In Hang Hoa Da Ban====================");
            System.out.println("=5==================In Hang Hoa Ton Kho===================");
            System.out.println("=6================In Hang Hoa Sap Het Han=================");
            System.out.println("=7=======================Tim Kiem=========================");
            System.out.println("=0=========================THOÁT==========================");
            System.out.println("Nhập Lựa Chọn Của Bạn: ");
            int lc = sc.nextInt();
            switch(lc){
                case 0:
                break;
                case 1:
                //them
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:kiemTraHSD();
                break;
                // case 5:TimKiem();
                // break;
                default: System.out.println("Nhap lua chon sai!!! Vui long nhap lai");
                break;
            }            
        }while(true);
    }

    public void kiemTraHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.gethSD().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }

    // public void TimKiem(){
    //     sc.nextLine();
    //     System.out.println("Nhap ma hang: ");
    //     int maHang = sc.nextInt();
    //     for (HangHoa hangHoa : dsHH) {
    //         if(maHang.equals(maHang)){
    //             hangHoa.inThongTin();
    //             break;
    //         }
    //     }
    // }
    
}
