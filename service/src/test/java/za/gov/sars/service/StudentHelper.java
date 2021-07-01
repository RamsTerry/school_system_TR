/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import java.util.Date;
import za.gov.sars.common.AddressType;
import za.gov.sars.common.PersonType;
import za.gov.sars.domain.Address;
import za.gov.sars.domain.ContactDetail;
import za.gov.sars.domain.Student;
import za.gov.sars.persistence.GradeRepository;
import za.gov.sars.persistence.StudentRepository;
import za.gov.sars.persistence.SubjectRepository;




/**
 *
 * @author S2028398
 */
public class StudentHelper {
   public static void addFacility(StudentRepository studentRepository,GradeRepository gradeRepository,SubjectRepository subjectRepository){

     Student student=new Student();
     student.setCreatedBy("Test");
     student.setCreatedDate(new Date());
     student.setPersonType(PersonType.LEARNER);
     student.setFirstName("Mulalo");
     student.setLastName("Mudau");
     student.setIdentityNumber("9887998528885");
     student.setStudentId("14014293");
     
     
       ContactDetail contactDetail = new ContactDetail();
       contactDetail.setCreatedBy("Test");
       contactDetail.setCreatedDate(new Date());
       contactDetail.setCellphoneNumber("0799035403");
       contactDetail.setEmailAddress("tramurebiwa.sars.gov.za");  
       student.setContactDetail(contactDetail);
       
       Address address1=new Address();
       address1.setCreatedBy("Test");
       address1.setCreatedDate(new Date());
       address1.setAddressType(AddressType.RESIDENTIAL);
       address1.setAddressLine1("6176 Aldo Magano 2090");
       address1.setAddressLine2("P.O BOX 4023");
       address1.setStreet("Block J");
       address1.setArea("Thohoyandou");
       address1.setCode("0950");
       student.addAddress(address1);
       
        Address address2=new Address();
       address2.setCreatedBy("Test");
       address2.setCreatedDate(new Date());
       address2.setAddressType(AddressType.POSTAL);
       address2.setAddressLine1("218 Hamutsha Codesa");
       address2.setAddressLine2("P.O BOX 447 ");
       address2.setStreet("16th Ruth");
       address2.setArea("Alexandra");
       address2.setCode("2090");
       student.addAddress(address2);
       

//    student.setGrades(gradeRepository.findAll());
    student.setSubjects(subjectRepository.findAll());
    studentRepository.save(student);

       Student student1 = new Student();
       student1.setCreatedBy("Test");
       student1.setCreatedDate(new Date());
       student1.setPersonType(PersonType.LEARNER);
       student1.setFirstName("Terry");
       student1.setLastName("Ramurebiwa");
       student1.setIdentityNumber("9503146171081");
       student1.setStudentId("14055487");

       ContactDetail contactDetail1 = new ContactDetail();
       contactDetail1.setCreatedBy("Test");
       contactDetail1.setCreatedDate(new Date());
       contactDetail1.setCellphoneNumber("061557443");
       contactDetail1.setEmailAddress("treal.sars.gov.za");
       student1.setContactDetail(contactDetail1);

       Address address4 = new Address();
       address4.setCreatedBy("Test");
       address4.setCreatedDate(new Date());
       address4.setAddressType(AddressType.RESIDENTIAL);
       address4.setAddressLine1("254 Muledane 2050");
       address4.setAddressLine2("P.O BOX 433");
       address4.setStreet("Block N");
       address4.setArea("Muledane");
       address4.setCode("2040");
       student1.addAddress(address4);

       Address address5 = new Address();
       address5.setCreatedBy("Test");
       address5.setCreatedDate(new Date());
       address5.setAddressType(AddressType.POSTAL);
       address5.setAddressLine1("218 Hamasakona");
       address5.setAddressLine2("P.O BOX 587 ");
       address5.setStreet("Stand 288");
       address5.setArea("Hamasakona");
       address5.setCode("0955");
       student1.addAddress(address5);

       //student1.setGrades(gradeRepository.findAll());
       student1.setSubjects(subjectRepository.findAll());
       studentRepository.save(student1);
   }
}
