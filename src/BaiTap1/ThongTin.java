package BaiTap1;

public class ThongTin {
    public static void main(String[] args) {
        // Tạo đối tượng nhân viên
        NhanVien nhanVien = new NhanVien("Nguyễn Văn A", 30, "Nhân viên kinh doanh");

        // Gọi phương thức hiển thị thông tin
        System.out.println("Thông tin nhân viên:");
        nhanVien.hienThiThongTin();
    }
}
