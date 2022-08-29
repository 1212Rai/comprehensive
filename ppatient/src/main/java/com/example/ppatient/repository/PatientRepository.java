

package com.example.ppatient.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ppatient.entity.Patient;

@Repository

public interface PatientRepository extends CrudRepository<Patient,Integer> {

}