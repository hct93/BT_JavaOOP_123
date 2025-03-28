package BaiTap2.company;

import BaiTap2.person.Person;

public class Company {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person("Nguyễn Văn A", 25, "Nam", "Hà Nội", "0123456789");

        // Gọi lại thông tin từ class Person (chỉ hiển thị name, age, gender)
        System.out.println("Thông tin nhân viên (Company):");
        System.out.println("Tên: " + person.getName());
        System.out.println("Tuổi: " + person.getAge());
        System.out.println("Giới tính: " + person.getGender());
    }
}