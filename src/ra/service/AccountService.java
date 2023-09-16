package ra.service;

import ra.model.Account;

public class AccountService {
    private Account[] accounts = new Account[100];

    public AccountService() {
        accounts[0] = new Account("hunghx","hung@gmail.com","123456");
    }

    // đăng nhập, đăng kí
    public boolean login(String username , String password){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null
                    && accounts[i].getUsername().equals(username)
                    &&accounts[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    public boolean existByUsername(String username){
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null
                    && accounts[i].getUsername().equals(username)
            ) {
                return true;
            }
        }
        return false;
    }
}
