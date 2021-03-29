package lab6.exceptii.exercitiu.service;

import lab6.exceptii.exercitiu.dto.User;
import lab6.exceptii.exercitiu.exception.ResourceNotFoundException;
import lab6.exceptii.exercitiu.exception.UserNotAuthorizedException;
import lab6.exceptii.exercitiu.exception.WrongCredentialsException;

import java.io.IOException;

public class AuthServiceImpl implements AuthService {

    User[] users = new User[10];
    String[] resources = {"/home","/settings","/news"};

    @Override
    public void login() {
        throw new WrongCredentialsException("User and passwor invalid", 401);
    }

    @Override
    public void accessResource(String resource) {
        boolean x = false;
        for (String res : resources) {
            if (res.equals(resource)) {
                x = true;
            }
        }
        if(!x) {
            throw new ResourceNotFoundException("Resource not found", 404);
        }
        throw  new UserNotAuthorizedException("User is not authorized", 403);
    }

    @Override
    public void checkedExample() throws IOException {

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
