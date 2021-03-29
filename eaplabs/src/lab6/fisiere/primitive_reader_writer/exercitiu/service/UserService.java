package lab6.fisiere.primitive_reader_writer.exercitiu.service;

import lab6.fisiere.primitive_reader_writer.exercitiu.dto.User;

public interface UserService {

    public User add(User user);

    public void delete(User user);

    public User edit(String newUsername);
}
