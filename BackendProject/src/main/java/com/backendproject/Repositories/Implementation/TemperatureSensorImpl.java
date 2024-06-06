/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backendproject.Repositories.Implementation;

import com.backendproject.Models.DataOutput;
import com.backendproject.Repositories.SensorRepository;
import java.util.Date;

/**
 *
 * @author sahan
 */
public class TemperatureSensorImpl implements SensorRepository {


    @Override
    public DataOutput SensorStatus(int errorCode) {
        
        
        DataOutput statusOutput = null;
        switch(errorCode){
            case 6734: statusOutput = new DataOutput("Ok", new Date()); break;
            case 6750: statusOutput = new DataOutput("Rebooting", new Date()); break;
            case 6799: statusOutput = new DataOutput("Low Battery", new Date());break;
            default: break;
        }
        return statusOutput; 
        
    }

    @Override
    public DataOutput SensorUnit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
