package com.example.samir;

public class MongoDBRepository implements IRepository {
    @Override
    public void get(String id){
        System.out.println("user fetched from MongoDB ");
    }
}