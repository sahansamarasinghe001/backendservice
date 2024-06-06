/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backendproject.Services;


import com.backendproject.Repositories.Implementation.TemperatureSensorImpl;
import com.backendproject.Repositories.SensorRepository;

/**
 *
 * @author sahan
 */
public class TemperatureService {
    
    private SensorRepository sensorRepository = new TemperatureSensorImpl();
    
    
    public void checkSensorStatus(){
        System.out.println(sensorRepository.SensorStatus(6734).getData());
        System.out.println(sensorRepository.SensorStatus(6734).getDateTime());
    }
    
}
