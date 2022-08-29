
package com.example.ddoctor.service.DoctorImpl;

import com.example.ddoctor.entity.Doctor;
import com.example.ddoctor.repository.DoctorRepository;
import com.example.ddoctor.service.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DoctorImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;
   

    @Override
    public Doctor showDoctorInformation(String name) {
        return doctorRepository.findByName(name);
    }

   

    @Override
    public boolean saveDoctorInformation(Doctor doctor) {
        doctorRepository.save(doctor);
        return true;
    }

    

   

    @Override
    public List<Doctor> getDoctors() {
        return (List<Doctor>) doctorRepository.findAll();
    }
}
