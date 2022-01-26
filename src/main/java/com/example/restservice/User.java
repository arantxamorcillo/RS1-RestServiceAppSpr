package com.example.restservice;



public class User {


    private  int id;
    private  String content;




    public User(int id, String content) {
        this.id = id;
        this.content = content;
    }


    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return "id: "+ id + ", name: "+ content;
    }
}
