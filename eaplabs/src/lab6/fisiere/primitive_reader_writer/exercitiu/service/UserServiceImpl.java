package lab6.fisiere.primitive_reader_writer.exercitiu.service;

import lab6.fisiere.primitive_reader_writer.exercitiu.dto.User;

public class UserServiceImpl implements UserService{

    private User[] users = new User[1];
    private LogService logService = new LogService();

    @Override
    public User add(User user) {
        users[0] = user;
        logService.write("A fost adaugat userul "+ user.getUsername());
        return user;
    }

    @Override
    public void delete(User user) {
        users[0] = null;
        logService.write("A fost sters userul "+ user.getUsername());
    }

    @Override
    public User edit(String newUsername) {
        User user = users[0];
        logService.write("A fost editat userul "+ user.getUsername() + ". Noul username este " + newUsername);
        user.setUsername(newUsername);
        return user;
    }
}
