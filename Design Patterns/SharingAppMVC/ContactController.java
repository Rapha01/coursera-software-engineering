package com.example.sharingapp;

import android.graphics.Bitmap;

/**
 * ItemController is responsible for all communication between views and Item object
 */
public class ContactController {

    private Contact contact;

    public ContactController(Contact contact) {
        this.contact = contact;
    }

    public String getId(){
        return contact.getId();
    }

    public void setId() {
        contact.setId();
    }

    public void updateId(String id) {
        contact.updateId(id);
    }

    public String getUsername() {
        return contact.getUsername();
    }

    public void setUsername(String username) {
        contact.setUsername(username);
    }

    public String getEmail() {
        return contact.getEmail();
    }

    public void setEmail(String email) {
        contact.setEmail(email);
    }
}
