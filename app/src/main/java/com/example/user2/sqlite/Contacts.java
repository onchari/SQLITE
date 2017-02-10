package com.example.user2.sqlite;

/**
 * Created by User2 on 09-Feb-17.
 */

public class Contacts {
    int _id;
    String _name;
    String _phone_number;

    public Contacts(){}

    public Contacts(int id, String name, String phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = phone_number;
    }

    public Contacts(String name, String phone_number){
        this._name = name;
        this._phone_number = phone_number;
    }

    public int getID(){
        return this._id;
    }

    public void setID(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }

    public  void setName(String nm){
        this._name = nm;
    }

    public  String get_phone_number(){
        return _phone_number;
    }

    public void set_phone_number(String no){
        this._phone_number = no;
    }
}
