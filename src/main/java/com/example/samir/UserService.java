package com.example.samir;

public class UserService {

    IRepository repository;
    public UserService(IRepository repository) {
        this.repository = repository;
    }
    public void get(String id) {
        repository.get(id);
    }
    public void setRepository(IRepository repository) {
        this.repository = repository;
    }

}
