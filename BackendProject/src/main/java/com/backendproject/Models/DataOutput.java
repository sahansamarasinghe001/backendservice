/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backendproject.Models;

import java.util.Date;

/**
 *
 * @author sahan
 */
public class DataOutput {
    
    private String data;


    private Date dateTime;
    
    public DataOutput(String data,Date dateTime){
        this.data = data;
        this.dateTime = dateTime;
    }
    
    public String getData(){
        return this.data;
    }
    
    public Date getDateTime(){
        return this.dateTime;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
    
    
    
}
