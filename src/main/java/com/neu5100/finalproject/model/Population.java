/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject.model;

import com.neu5100.finalproject.data.Data;

/**
 *
 * @author An
 */
public class Population {
    private int pop_id;
    private String pop_name;
    private int pop_age;
    private int pop_gender ;
    private String pop_phone;

    public Population(int pop_id, String pop_name, int pop_age, int pop_gender, String pop_phone) {
        this.pop_id = pop_id;
        this.pop_name = pop_name;
        this.pop_age = pop_age;
        this.pop_gender = pop_gender;
        this.pop_phone = pop_phone;
    }

   

    public int getPop_id() {
        return pop_id;
    }

    public void setPop_id(int pop_id) {
        this.pop_id = pop_id;
    }

    public String getPop_name() {
        return pop_name;
    }

    public void setPop_name(String pop_name) {
        this.pop_name = pop_name;
    }

    public int getPop_age() {
        return pop_age;
    }

    public void setPop_age(int pop_age) {
        this.pop_age = pop_age;
    }

    public int getPop_gender() {
        return pop_gender;
    }

    public void setPop_gender(int pop_gender) {
        this.pop_gender = pop_gender;
    }

    public String getPop_phone() {
        return pop_phone;
    }

    public void setPop_phone(String pop_phone) {
        this.pop_phone = pop_phone;
    }

    
    public boolean update(){
        Data instance = Data.getInstance();
        return instance.updatePop(this);
    }
}
