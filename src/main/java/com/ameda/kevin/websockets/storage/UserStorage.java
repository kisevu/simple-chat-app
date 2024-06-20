package com.ameda.kevin.websockets.storage;/*
*
@author ameda
@project websockets
@
*
*/

import java.util.HashSet;
import java.util.Set;

public class UserStorage {

    private static UserStorage instance;
    private Set<String> users = new HashSet<>();
    public UserStorage(){}

    public static synchronized  UserStorage getInstance(){
        if(instance == null){
            instance = new UserStorage();
        }
        return instance;
    }

    public Set<String>  getUsers(){
        return users;
    }
    public void setUser(String username) throws Exception{
        if(users.contains(username)){
            throw new Exception("user: "+ username + " already exists in the system.");
        }
        this.users.add(username);
    }

    public void displayAllUsers(){
        users.forEach(System.out::println);
    }

}
