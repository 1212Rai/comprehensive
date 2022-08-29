
package com.example.ppatient.service;

import java.util.List;

import com.example.ppatient.entity.Patient;




public interface PatientService {

    
    public Patient showPatientInformation(Integer Id);
    
    public boolean savePatientInformation(Patient patient);
   
    

}
