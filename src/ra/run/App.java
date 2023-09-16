package ra.run;

import ra.model.Account;
import ra.service.AccountService;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    private static AccountService accountService = new AccountService();
    public static void main(String[] args) {
        register();
        // hiển thị menu
        while(true){
            // 1 login
            // 2 register
            // 3 thoát

            // nhập lựa chọn
            // switch case
            // case 1: login()

            // case 2 : register()
        }


    }
    public static void login(){
        // hiển thị nhập thông tin
        // kiểm tra thông tin hợp lệ hay không
        // nếu hợp lệ thì hiện thị ra trang home (chào mưng đến với trang chủ)
    }
    public static void register(){
        Account account = new Account();
        // hiển thị form nhập thông tin
        // kiểm tra thông tin đã xác thực chưa
        // nếu đã xác thưc thì hiển thị ra trang đăng nhập (login())
        System.out.println("Nhập username");
        while(true){
            String username = new Scanner(System.in).nextLine();
            if(accountService.existByUsername(username)){
                System.out.println("Đã tồn tại, vui lòng nhập tên khác");
            }else {
                account.setUsername(username);
                break;
            }
        }

    }
}
