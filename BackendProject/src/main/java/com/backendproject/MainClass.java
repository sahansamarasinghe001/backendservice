/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backendproject;

import com.backendproject.Services.TemperatureService;

/**
 *
 * @author sahan
 */
public class MainClass {
    
    public static void main(String[] args) {
        TemperatureService temperatureService = new TemperatureService();
        temperatureService.checkSensorStatus();
    }
    
}
