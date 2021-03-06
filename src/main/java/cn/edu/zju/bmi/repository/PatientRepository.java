package cn.edu.zju.bmi.repository;

import cn.edu.zju.bmi.entity.DAO.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, String> {
    List<Patient> findTop2ByOrderByUnifiedPatientID();
    Patient findPatientByUnifiedPatientID(String UnifiedPatientID);
    List<Patient> findByBirthdayBetween(Date startTime, Date endTime);
    List<Patient> findByBirthdayAfter(Date startTime);
    List<Patient> findByBirthdayBefore(Date endTime);
}
