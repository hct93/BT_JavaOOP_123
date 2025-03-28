package BaiTap1;

public class NhanVien {

        // Các biến (thuộc tính)
        private String hoTen;
        private int tuoi;
        private String chucVu;

        // Constructor không tham số
        public NhanVien() {
        }

        // Constructor có tham số
        public NhanVien(String hoTen, int tuoi, String chucVu) {
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.chucVu = chucVu;
        }

        // Getter và Setter
        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public String getChucVu() {
            return chucVu;
        }

        public void setChucVu(String chucVu) {
            this.chucVu = chucVu;
        }

        // Phương thức hiển thị thông tin nhân viên
        public void hienThiThongTin() {
            System.out.println("Họ tên: " + hoTen);
            System.out.println("Tuổi: " + tuoi);
            System.out.println("Chức vụ: " + chucVu);
        }
    }
