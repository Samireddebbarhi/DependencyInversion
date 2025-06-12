package com.example.samir;

public class FakeRepository implements IRepository {
    @Override
    public void get(String id) {
        System.out.println("User is fetched from FakeRepository");
    }

}
