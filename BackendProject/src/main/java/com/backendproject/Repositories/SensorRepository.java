/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backendproject.Repositories;

import com.backendproject.Models.DataOutput;

/**
 *
 * @author sahan
 */
public interface SensorRepository {
    
    public DataOutput SensorStatus(int errorCode);
    public DataOutput SensorUnit();
    
}
