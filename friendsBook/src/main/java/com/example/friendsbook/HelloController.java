package com.example.friendsbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    //list of variables from GUI
    public Label setName;
    public Label setFollowers;
    public Label setSchool;
    public Button removeButton;
    public TextField getName;
    public TextField getFollowers;
    public TextField getSchool;
    public ListView<Friend> friendList = new ListView();

    //Requires: add friend button to be clicked from GUI
    //Modifies: this and GUI interface
    //Effects: creates friend object from desired variables
    public void addToFriends(ActionEvent actionEvent) {
        String n = getName.getText();
        String s = getSchool.getText();
        String f = (getFollowers.getText());

        if (n != "" && f != "" && s != "") {
            Friend temp = new Friend(n, f, s);

            friendList.getItems().add(temp);

            getName.clear();
            getFollowers.clear();
            getSchool.clear();
        };
    }

    //Requires: clicking over display port of GUI friend list
    //Modifies: friendsBook GUI
    //Effects: establishes listed detail for list of friends.
    public void displayProduct(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        setName.setText(temp.name);
        setSchool.setText(temp.getSchool());
        setFollowers.setText(temp.getFollowers());
    }

    //Requires: clicking on the remove friend button in GUI
    //Modifies: GUI and this
    //Effects: remove friend from friendlist, and wipe their details of interface.
    public void removeFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        if (temp != null) {
            temp.unfriend(temp);
            setName.setText(" ");
            setFollowers.setText(" ");
            setSchool.setText(" ");
            friendList.getItems().remove(temp);
        };
    }
}