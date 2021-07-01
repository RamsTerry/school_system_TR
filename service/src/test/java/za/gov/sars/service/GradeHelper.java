/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import java.util.Date;
import za.gov.sars.common.PersonType;
import za.gov.sars.common.SystemUserType;
import za.gov.sars.domain.Employee;
import za.gov.sars.domain.Grade;
import za.gov.sars.persistence.EmployeeRepository;
import za.gov.sars.persistence.GradeRepository;

/**
 *
 * @author S2028398
 */
public class GradeHelper {

    public static void addFacility(GradeRepository gradeRepository) {
        Grade grade1 = new Grade();
        grade1.setCreatedBy("Test");
        grade1.setCreatedDate(new Date());
        grade1.setDesignation("A");
        grade1.setName("Grade 10");
        gradeRepository.save(grade1);

        Grade grade2 = new Grade();
        grade2.setCreatedBy("Test");
        grade2.setCreatedDate(new Date());
        grade2.setDesignation("B");
        grade2.setName("Grade 11");
        gradeRepository.save(grade2);

        Grade grade3 = new Grade();
        grade3.setCreatedBy("Test");
        grade3.setCreatedDate(new Date());
        grade3.setDesignation("C");
        grade3.setName("Grade 8");
        gradeRepository.save(grade3);

        Grade grade4 = new Grade();
        grade4.setCreatedBy("Test");
        grade4.setCreatedDate(new Date());
        grade4.setDesignation("D");
        grade4.setName("Grade 9");
        gradeRepository.save(grade4);

        Grade grade5 = new Grade();
        grade5.setCreatedBy("Test");
        grade5.setCreatedDate(new Date());
        grade5.setDesignation("A");
        grade5.setName("Grade 12");
        gradeRepository.save(grade5);

        Grade grade6 = new Grade();
        grade6.setCreatedBy("Test");
        grade6.setCreatedDate(new Date());
        grade6.setDesignation("E");
        grade6.setName("Grade 12");
        gradeRepository.save(grade6);
    }
}