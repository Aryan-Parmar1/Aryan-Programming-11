package com.example.friendsbook;

public class Friend {
    public String name;
    private String followers;
    private String school;

    //friend constructor
    Friend (String n, String f, String s) {
        name = n;
        followers = f;
        school = s;
    };

    //getters and setters
    public String toString() {
        return name;
    };
    public String getFollowers() {return followers;};

    public String getSchool() {return school;};

    //change removed friend's value to null
    public void unfriend(Friend friend) {
        friend = null;
    }
}
