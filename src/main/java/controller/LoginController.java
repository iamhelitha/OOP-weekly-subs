package controller;

import Model.User;

import java.util.ArrayList;

public class LoginController {
    ArrayList<User> userDB;
    public LoginController(){
        userDB = new ArrayList<>();
        CreatDB();
    }
    public void CreatDB(){
        userDB.add(new User("test1","123","admin"));
        userDB.add(new User("test2","456","bike"));
        userDB.add(new User("test3","789","rider"));
        userDB.add(new User("test4","101","bank"));

    }
    public User validateUser(User currentU){
        for (User i:userDB){
            if (i.getUserName().equals(currentU.getUserName())&&i.getPassword().equals(currentU.getPassword())){
                return i;
            }
        }
        return null;
    }
}
