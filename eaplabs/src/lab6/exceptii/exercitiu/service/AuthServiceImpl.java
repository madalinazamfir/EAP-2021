package lab6.exceptii.exercitiu.service;

import lab6.exceptii.exercitiu.dto.User;

public class AuthServiceImpl implements AuthService {

    User[] users = new User[10];
    String[] resources = {"/home","/settings","/news"};

    @Override
    public void login() {

    }

    @Override
    public void accessResource(String resource) {

    }

    private void initData() {
        for (int i = 0; i < users.length; i++) {
            User user = new User();
            user.setUsername("kfsljflsjdf");
            user.setPassword("akfjsljdls");
            users[i] = user;
        }
    }
}
