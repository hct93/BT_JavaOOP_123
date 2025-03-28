package BaiTap2.person;

public class Information {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person("Nguyễn Văn A", 25, "Nam", "Hà Nội", "0123456789");

        // Gọi lại tất cả thông tin từ class Person
        System.out.println("Thông tin cá nhân:");
        System.out.println("Tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());
        System.out.println("Địa chỉ: " + person.getAddress());
        System.out.println("Số điện thoại: " + person.getPhone());
    }
}
