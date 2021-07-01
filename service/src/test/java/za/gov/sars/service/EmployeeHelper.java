/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.service;

import java.util.Date;
import za.gov.sars.common.AddressType;
import za.gov.sars.common.PersonType;
import za.gov.sars.common.SystemUserType;
import za.gov.sars.domain.Address;
import za.gov.sars.domain.ContactDetail;
import za.gov.sars.domain.Employee;
import za.gov.sars.domain.Grade;
import za.gov.sars.domain.Subject;
import za.gov.sars.persistence.EmployeeRepository;
import za.gov.sars.persistence.GradeRepository;
import za.gov.sars.persistence.SubjectRepository;



/**
 *
 * @author S2028398
 */
public class EmployeeHelper {
   public static void addFacility(EmployeeRepository employeeRepository,GradeRepository gradeRepository,SubjectRepository subjectRepository){

     Employee employee1=new Employee();
     employee1.setCreatedBy("Test");
     employee1.setCreatedDate(new Date());
     employee1.setPersonType(PersonType.EMPLOYEE);
     employee1.setFirstName("Terry");
     employee1.setLastName("Ramurebiwa");
     employee1.setIdentityNumber("9887998528885");
     employee1.setEmployeeId("17889887");
     employee1.setEmployeeType(SystemUserType.EDUCATOR);
     employee1.setSaceRegNumber("00078669");
     
       ContactDetail contactDetail = new ContactDetail();
       contactDetail.setCreatedBy("Test");
       contactDetail.setCreatedDate(new Date());
       contactDetail.setCellphoneNumber("0799035403");
       contactDetail.setEmailAddress("tramurebiwa.sars.gov.za");
       contactDetail.setTelephoneNumber("0115543411");  
       employee1.setContactDetail(contactDetail);
       
       Address address1=new Address();
       address1.setCreatedBy("Test");
       address1.setCreatedDate(new Date());
       address1.setAddressType(AddressType.RESIDENTIAL);
       address1.setAddressLine1("6176 Aldo Magano 2090");
       address1.setAddressLine2("P.O BOX 4023");
       address1.setStreet("Block J");
       address1.setArea("Thohoyandou");
       address1.setCode("0950");
       employee1.addAddress(address1);
       
        Address address2=new Address();
       address2.setCreatedBy("Test");
       address2.setCreatedDate(new Date());
       address2.setAddressType(AddressType.POSTAL);
       address2.setAddressLine1("218 Hamutsha Codesa");
       address2.setAddressLine2("P.O BOX 447 ");
       address2.setStreet("16th Ruth");
       address2.setArea("Alexandra");
       address2.setCode("2090");
       employee1.addAddress(address2);
       

    employee1.setGrades(gradeRepository.findAll());
    employee1.setSubjects(subjectRepository.findAll());
    employeeRepository.save(employee1);
    //////////////////////////////////////////////////////////////////admin
   
         Employee employee2=new Employee();
     employee2.setCreatedBy("Test");
     employee2.setCreatedDate(new Date());
     employee2.setPersonType(PersonType.EMPLOYEE);
     employee2.setFirstName("Ndivhuwo");
     employee2.setLastName("Tshiedza");
     employee2.setIdentityNumber("900990899852");
     employee2.setEmployeeId("17889888");
     employee2.setEmployeeType(SystemUserType.ADMIN);
//     employee2.setSaceRegNumber("00078669");
     
       ContactDetail contactDetail1 = new ContactDetail();
       contactDetail1.setCreatedBy("Test");
       contactDetail1.setCreatedDate(new Date());
       contactDetail1.setCellphoneNumber("0714478811");
       contactDetail1.setEmailAddress("ntshiedza.sars.gov.za");
       contactDetail1.setTelephoneNumber("0115544755");  
       employee2.setContactDetail(contactDetail1);
       
//       Address address=new Address();
//       address.setCreatedBy("Test");
//       address.setCreatedDate(new Date());
//       address.setAddressType(AddressType.RESIDENTIAL);
//       address.setAddressLine1("6176 Aldo Magano 2090");
//       address.setAddressLine2("P.O BOX 4023");
//       address.setArea("Thohoyandou");
//       address.setCode("0950");
//       employee2.addAddress(address);
//       
//        Address address3=new Address();
//       address3.setCreatedBy("Test");
//       address3.setCreatedDate(new Date());
//       address3.setAddressType(AddressType.POSTAL);
//       address3.setAddressLine1("218 Hamutsha Codesa");
//       address3.setAddressLine2("P.O BOX 447 ");
//       address3.setArea("Alexandra");
//       address3.setCode("2090");
//       employee2.addAddress(address3);
       
//     employee2.setGrades(gradeRepository.findAll());
//    employee2.setSubjects(subjectRepository.findAll());
    employeeRepository.save(employee2);
      ///////////////////////////////////////////////////////////clerk
    
      Employee employee3=new Employee();
     employee3.setCreatedBy("Test");
     employee3.setCreatedDate(new Date());
     employee3.setPersonType(PersonType.EMPLOYEE);
     employee3.setFirstName("NKHANGWE");
     employee3.setLastName("Mudau");
     employee3.setIdentityNumber("94444746171081");
     employee3.setEmployeeId("7788978");
     employee3.setEmployeeType(SystemUserType.CLERK);
//     employee2.setSaceRegNumber("00078669");
     
       ContactDetail contactDetail2 = new ContactDetail();
       contactDetail2.setCreatedBy("Test");
       contactDetail2.setCreatedDate(new Date());
       contactDetail2.setCellphoneNumber("0736772755");
       contactDetail2.setEmailAddress("nmudau.sars.gov.za");
       contactDetail2.setTelephoneNumber("00021145");  
       employee3.setContactDetail(contactDetail2);
       
       Address address4=new Address();
       address4.setCreatedBy("Test");
       address4.setCreatedDate(new Date());
       address4.setAddressType(AddressType.RESIDENTIAL);
       address4.setAddressLine1("6176 Aldo Magano 2090");
       address4.setAddressLine2("P.O BOX 4023");
       address4.setStreet("Muledane");
       address4.setArea("Thohoyandou");
       address4.setCode("0950");
       employee3.addAddress(address4);
       
        Address address6=new Address();
       address6.setCreatedBy("Test");
       address6.setCreatedDate(new Date());
       address6.setAddressType(AddressType.POSTAL);
       address6.setAddressLine1("218 Hamutsha Codesa");
       address6.setAddressLine2("P.O BOX 447 ");
       address6.setStreet("Codesa");
       address6.setArea("Alexandra");
       address6.setCode("2090");
       employee3.addAddress(address6);
       
    employeeRepository.save(employee3);
       ////////////////////////////////////////////////systemUser 
   
   }
}
