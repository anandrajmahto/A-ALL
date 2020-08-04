package com.armscreation.a_games.chainpro;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class DataAdapter {

    public String name;
    public String email;
    public String g1;

    public String turn;
    public String indicator;


    public DataAdapter(String turn, String indicator) {
        this.turn = turn;
        this.indicator = indicator;
    }


    public DataAdapter(String g1) {
        this.g1 = g1;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getindicator() {
        return indicator;
    }

    public void setindicator(String blank) {
        this.indicator = indicator;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }



    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public DataAdapter() {
    }
}

