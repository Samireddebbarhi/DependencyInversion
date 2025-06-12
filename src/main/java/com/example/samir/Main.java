package com.example.samir;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           String id = "xyz" ;
           UserService  userService = new UserService(new SqlDBRepository());
           userService.get(id);
           userService.setRepository(new MongoDBRepository());
           userService.get(id);



    }
}