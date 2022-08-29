
package com.example.ppatient.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ppatient.entity.Patient;
import com.example.ppatient.repository.PatientRepository;
import com.example.ppatient.service.PatientService;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PatientImpl implements PatientService {

    
    @Autowired
    PatientRepository patientRepository;

   

    @Override
    public Patient showPatientInformation(Integer id) {
        return patientRepository.findById(id).get();
    }

   

    @Override
    public boolean savePatientInformation(Patient patient) {

        
        patientRepository.save(patient);
        
        return true;
    }

   

   
}
