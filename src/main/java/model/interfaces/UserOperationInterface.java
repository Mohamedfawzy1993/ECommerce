package model.interfaces;

import model.beans.User;

import java.util.Vector;

public interface UserOperationInterface {

    public User getUserbyEmail(String email);
    public int addUser(User newUser);
    public Vector<User> getUsers(int type);
    public Vector<User> getUsers();
}