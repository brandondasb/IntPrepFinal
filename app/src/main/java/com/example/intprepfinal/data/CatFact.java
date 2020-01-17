package com.example.intprepfinal.data;


import com.example.intprepfinal.data.User;

public class CatFact {
    private String _id ;
    private String text ;
    private String type ;
    private User user;
    private String upvotes;

    public String get_id() {
        return _id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public String getUpvotes() {
        return upvotes;
    }
}
