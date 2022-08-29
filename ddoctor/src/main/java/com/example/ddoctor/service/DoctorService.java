
package com.example.ddoctor.service;

import java.util.List;

import com.example.ddoctor.entity.Doctor;




public interface DoctorService {

    public Doctor showDoctorInformation(String name);

    public boolean saveDoctorInformation(Doctor doctor);
   
   
    public List<Doctor> getDoctors();

}
