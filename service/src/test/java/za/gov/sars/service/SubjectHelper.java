/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import java.util.Date;
import za.gov.sars.domain.Subject;
import za.gov.sars.persistence.SubjectRepository;

/**
 *
 * @author S2028398
 */
public class SubjectHelper {

    public static void addFacility(SubjectRepository subjectRepository) {
        Subject subject1 = new Subject();
        subject1.setCreatedBy("Test");
        subject1.setCreatedDate(new Date());
        subject1.setName("English");
        subject1.setCode("ECS 1545");
        subjectRepository.save(subject1);

        Subject subject2 = new Subject();
        subject2.setCreatedBy("Test");
        subject2.setCreatedDate(new Date());
        subject2.setName("Mathematics");
        subject2.setCode("MAT 1542");
        subjectRepository.save(subject2);

        Subject subject3 = new Subject();
        subject3.setCreatedBy("Test");
        subject3.setCreatedDate(new Date());
        subject3.setName("Biology");
        subject3.setCode("BIO 1354");
        subjectRepository.save(subject3);

        Subject subject4 = new Subject();
        subject4.setCreatedBy("Test");
        subject4.setCreatedDate(new Date());
        subject4.setName("Software Engineering");
        subject4.setCode("COM 2536");
        subjectRepository.save(subject4);

        Subject subject5 = new Subject();
        subject5.setCreatedBy("Test");
        subject5.setCreatedDate(new Date());
        subject5.setName("Artificial Inteligence");
        subject5.setCode("COM 3598");
        subjectRepository.save(subject5);

        Subject subject6 = new Subject();
        subject6.setCreatedBy("Test");
        subject6.setCreatedDate(new Date());
        subject6.setName("Database Enginering");
        subject6.setCode("COM 8574");
        subjectRepository.save(subject6);

    }
}
