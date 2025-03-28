package BaiTap2.person;

public class Person {private String name;    // Tên
    private int age;        // Tuổi
    private String gender;  // Giới tính
    private String address; // Địa chỉ
    private String phone;   // Số điện thoại

    // Hàm xây dựng (constructor) không tham số
    public Person() {
    }

    // Hàm xây dựng (constructor) có tham số
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
