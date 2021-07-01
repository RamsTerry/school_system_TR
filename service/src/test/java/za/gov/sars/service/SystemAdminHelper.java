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




/**
 *
 * @author S2028398
 */
public class SystemAdminHelper {
   public static void addSystemAdmin(EmployeeRepository employeeRepository){
      
       
     Employee systemAdmin=new Employee();
     systemAdmin.setCreatedBy("Test");
     systemAdmin.setCreatedDate(new Date());
     systemAdmin.setPersonType(PersonType.SYSTEM_USER);
     systemAdmin.setFirstName("Lufuno");
     systemAdmin.setLastName("Mulaudzi");
     systemAdmin.setIdentityNumber("95573558755");
     systemAdmin.setEmployeeId("1872255");
     systemAdmin.setEmployeeType(SystemUserType.ADMIN);
     employeeRepository.save(systemAdmin);
 
    //////////////////////////////////////////////////////////////////admin
        Employee systemAdmin2=new Employee();
     systemAdmin2.setCreatedBy("Test");
     systemAdmin2.setCreatedDate(new Date());
     systemAdmin2.setPersonType(PersonType.SYSTEM_USER);
     systemAdmin2.setFirstName("Terry");
     systemAdmin2.setLastName("Ramurebiwa");
     systemAdmin2.setIdentityNumber("9335877335");
     systemAdmin2.setEmployeeId("82279");
     systemAdmin2.setEmployeeType(SystemUserType.ADMIN);
     employeeRepository.save(systemAdmin2);
     
     Employee systemAdmin3=new Employee();
     systemAdmin3.setCreatedBy("Test");
     systemAdmin3.setCreatedDate(new Date());
     systemAdmin3.setPersonType(PersonType.SYSTEM_USER);
     systemAdmin3.setFirstName("Andani");
     systemAdmin3.setLastName("Netshimboni");
     systemAdmin3.setIdentityNumber("9335877335");
     systemAdmin3.setEmployeeId("82279");
     systemAdmin3.setEmployeeType(SystemUserType.ADMIN);
     employeeRepository.save(systemAdmin3);
   }
}
