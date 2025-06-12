package com.example.samir;

public class SqlDBRepository implements IRepository {
    @Override
    public void get(String id){
        System.out.println("user fetched from sql DB");
    }
}
