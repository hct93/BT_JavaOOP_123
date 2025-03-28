package BaiTap3.common;

public class BaseTest {
    protected String browser;

    // Hàm tạo driver dựa trên cấu hình từ class Constants
    public void createDriver() {
        System.out.println("Browser: " + Constants.BROWSER);
        System.out.println("Report: " + Constants.REPORT);
        System.out.println("Headless: " + Constants.HEADLESS);

        this.browser = Constants.BROWSER;
        System.out.println("Get Browser for : " + browser);
    }

    // Hàm đóng driver
    public void closeDriver() {
        System.out.println("Closed browser: " + browser);
    }
}
